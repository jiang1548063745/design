package com.rorschach.pattern.proxy.myproxy.proxy;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * @author Rorschach
 * @date 2021-4-11 15:04
 */
public class MyClassLoader extends ClassLoader{

    private final File classPathFile;

    public MyClassLoader() {
        String classPath = MyClassLoader.class.getResource("").getPath();
        this.classPathFile = new File(classPath);
    }

    @Override
    protected Class<?> findClass(String name) {

        String className = MyClassLoader.class.getPackage().getName() + "." + name;

        if (classPathFile  != null) {
            File classFile = new File(classPathFile,name.replaceAll("\\.","/") + ".class");
            if (classFile.exists()) {
                FileInputStream in;
                ByteArrayOutputStream out;
                try{
                    in = new FileInputStream(classFile);
                    out = new ByteArrayOutputStream();
                    byte [] buff = new byte[1024];
                    int len;
                    while ((len = in.read(buff)) != -1){
                        out.write(buff,0,len);
                    }
                    return defineClass(className, out.toByteArray(),0, out.size());
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
