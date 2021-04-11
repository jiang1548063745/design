package com.rorschach.pattern.proxy.myproxy.client;

import com.rorschach.pattern.proxy.myproxy.proxy.MyClassLoader;
import com.rorschach.pattern.proxy.myproxy.proxy.MyInvocationHandler;
import com.rorschach.pattern.proxy.myproxy.proxy.MyProxy;

import java.lang.reflect.Method;

/**
 * @author Rorschach
 * @date 2021-4-11 15:07
 */
public class ProxyClient implements MyInvocationHandler {

    private IWorker target;

    public IWorker getInstance(IWorker target) {
        this.target = target;
        Class<?> clazz = this.target.getClass();
        return (IWorker) MyProxy.newProxyInstance(new MyClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(this.target, args);
        after();

        return result;
    }

    private void after() {
        System.out.println("<<< 方法后执行");
    }

    private void before() {
        System.out.println(">>> 方法前执行");
    }
}
