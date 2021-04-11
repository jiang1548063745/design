package com.rorschach.pattern.proxy.myproxy.proxy;

import java.lang.reflect.Method;

/**
 * @author Rorschach
 * @date 2021-4-11 14:55
 */
public interface MyInvocationHandler {

    /**
     * 处理代理实例上的方法调用并返回结果
     *
     * @param proxy   被代理的方法
     * @param method  对应的实例在代理实例上调用的接口方法
     * @param args    在代理实例上的方法调用中传递的参数
     * @return        从方法调用返回的值
     * @throws Throwable @see     UndeclaredThrowableException
     */
    Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
