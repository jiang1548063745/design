package com.rorschach.pattern.proxy.jdk;

import com.rorschach.pattern.proxy.IPerson;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Rorschach
 * @date 2021-4-11 0:40
 */
public class JdkMeiPo implements InvocationHandler {

    private IPerson target;

    public IPerson getInstance(IPerson target) {
        this.target = target;
        Class<?> clazz = target.getClass();

        return (IPerson) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // before
        before();

        Object result = method.invoke(this.target, args);
        
        // after
        after();
        
        return result;
    }

    private void after() {
        System.out.println("车况良好 开始开车");
    }

    private void before() {
        System.out.println("我是媒婆, 确定需求 开始物色");
    }
}
