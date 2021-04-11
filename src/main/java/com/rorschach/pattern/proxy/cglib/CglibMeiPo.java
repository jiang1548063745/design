package com.rorschach.pattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Rorschach
 * @date 2021-4-11 1:07
 */
public class CglibMeiPo implements MethodInterceptor {

    private Object target;

    public Object getInstance(Object target) {
        Enhancer enhancer = new Enhancer();
        this.target = target;
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();

        Object result = methodProxy.invoke(target, objects);

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
