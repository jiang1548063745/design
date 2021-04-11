package com.rorschach.pattern.proxy.jdk;

import com.rorschach.pattern.proxy.IPerson;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * @author Rorschach
 * @date 2021-4-11 0:47
 */
public class Test {

    public static void main(String[] args) {
        JdkMeiPo jdkMeiPo = new JdkMeiPo();
        IPerson zhangSanProxy = jdkMeiPo.getInstance(new ZhangSan());
        zhangSanProxy.findLove();

        byte[] bytes =  ProxyGenerator.generateProxyClass("$proxy0", new Class[]{IPerson.class});
        try {
            FileOutputStream os = new FileOutputStream("./src/main/java/com/rorschach/pattern/proxy/jdk/$proxy0.class");
            os.write(bytes);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        IPerson wangWuProxy = jdkMeiPo.getInstance(new WangWu());
        wangWuProxy.findLove();
    }
}
