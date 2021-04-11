package com.rorschach.pattern.proxy.myproxy.proxy;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.*;

/**
 * @author Rorschach
 * @date 2021-4-11 15:02
 */
public class MyProxy {

    public static final String LN = "\r\n";

    private static final Map<Class<?>,Class<?>> MAPPINGS = new HashMap<>();
    static {
        MAPPINGS.put(int.class, Integer.class);
    }

    public static Object newProxyInstance(MyClassLoader loader,
                                          Class<?>[] interfaces,
                                          MyInvocationHandler h)
            throws IllegalArgumentException {


        try {
            // 1.动态生成源码 .java文件
            String src = generateSrc(interfaces, h.getClass().getSimpleName());

            // 2.把java文件输出到磁盘 保存为 $proxy0.java 文件
            String filePath = MyProxy.class.getResource("").getPath();
            File f = new File(filePath + h.getClass().getSimpleName() + "$Proxy.java");
            FileWriter fw = new FileWriter(f);
            fw.write(src);
            fw.flush();
            fw.close();

            // 3.把java文件编译成 $proxy0.class 文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manage = compiler.getStandardFileManager(null,null,null);
            Iterable<? extends JavaFileObject> iterable = manage.getJavaFileObjects(f);

            JavaCompiler.CompilationTask task = compiler.getTask(null,manage,null,null,null, iterable);
            task.call();
            manage.close();

            // 4.把生成的.class文件加载到jvm中
            Class<?> proxyClass = loader.findClass(h.getClass().getSimpleName() + "$Proxy");
            Constructor<?> constructor = proxyClass.getConstructor(MyInvocationHandler.class);

            // 5.字节码重组返回新的代理对象
            boolean delFlag = f.delete();
            if (delFlag) {
                System.out.println("tip:: 字节码已删除");
            }
            return constructor.newInstance(h);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    private static String generateSrc(Class<?>[] interfaces, String className) {
        StringBuilder source = new StringBuilder();
        StringBuilder implementsInterfaces = new StringBuilder();

        // package
        source.append(MyProxy.class.getPackage()).append(";").append(LN);

        // import interface
        for (int i = 0; i < interfaces.length; i++ ) {
            source.append("import ").append(interfaces[i].getName()).append(";").append(LN);

            if (i != interfaces.length - 1) {
                implementsInterfaces.append(interfaces[i].getSimpleName()).append(",");
            } else {
                implementsInterfaces.append(interfaces[i].getSimpleName());
            }
        }

        source.append("import java.lang.reflect.*;" + LN);

        source.append(LN);

        // class open
        String proxyClassName = className + "$Proxy";
        source.append("public class ").append(proxyClassName).append(" implements ").append(implementsInterfaces).append("{").append(LN);

        // 类变量
        source.append("MyInvocationHandler h;").append(LN);

        // 构造方法
        source.append("public ").append(proxyClassName).append("(MyInvocationHandler h) {").append(LN);
        source.append("this.h = h;").append(LN);
        source.append("}").append(LN);

        // methods
        for (Class<?> item: interfaces) {
            for (Method method: item.getMethods()) {
                Class<?>[] params = method.getParameterTypes();

                StringBuilder paramNames = new StringBuilder();
                StringBuilder paramValues = new StringBuilder();
                StringBuilder paramClasses = new StringBuilder();

                for (int index = 0; index < params.length; index++) {
                    Class<?> clazz = params[index];
                    String paramType = clazz.getName();
                    String paramName = toLowerFirstCase(clazz.getSimpleName());

                    paramNames.append(paramType).append(" ").append(paramName);
                    paramValues.append(paramName);
                    paramClasses.append(clazz.getName()).append(".class");

                    if(index > 0 && index < params.length - 1){
                        paramNames.append(",");
                        paramClasses.append(",");
                        paramValues.append(",");
                    }
                }

                source.append("public ").append(method.getReturnType().getName()).append(" ").append(method.getName()).append("(").append(paramNames.toString()).append(") {").append(LN);
                source.append("try {" ).append(LN);
                source.append("Method m = ").append(item.getName()).append(".class.getMethod(\"").append(method.getName()).append("\",new Class[]{").append(paramClasses.toString()).append("});").append(LN);
                source.append(hasReturnValue(method.getReturnType()) ? "return " : "").append(getCaseCode("this.h.invoke(this,m,new Object[]{" + paramValues + "})", method.getReturnType())).append(";").append(LN);
                source.append("}catch(Error _ex) { ").append(LN);
                source.append("throw _ex;").append(LN);
                source.append("}").append(LN);
                source.append("catch(Throwable e){").append(LN);
                source.append("throw new UndeclaredThrowableException(e);").append(LN);
                source.append("}").append(LN);
                source.append(getReturnEmptyCode(method.getReturnType())).append(LN);
                source.append("}").append(LN);
            }
        }

        source.append("}").append(LN);

        return source.toString();
    }

    private static String getCaseCode(String code, Class<?> returnClass){
        if(MAPPINGS.containsKey(returnClass)){
            return "((" + MAPPINGS.get(returnClass).getName() +  ")" + code + ")." + returnClass.getSimpleName() + "Value()";
        }
        return code;
    }

    private static boolean hasReturnValue(Class<?> clazz){
        return clazz != void.class;
    }

    private static String getReturnEmptyCode(Class<?> returnClass) {
        if(MAPPINGS.containsKey(returnClass)){
            return "return 0;";
        }else if(returnClass == void.class){
            return "";
        }else {
            return "return null;";
        }
    }

    private static String toLowerFirstCase(String src){
        char [] chars = src.toCharArray();
        chars[0] += 32;
        return String.valueOf(chars);
    }
}
