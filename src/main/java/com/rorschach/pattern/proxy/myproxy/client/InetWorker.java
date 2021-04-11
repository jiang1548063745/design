package com.rorschach.pattern.proxy.myproxy.client;

/**
 * @author Rorschach
 * @date 2021-4-11 18:30
 */
public class InetWorker implements IWorker, IMoyu{
    @Override
    public void work() {
        System.out.println("work ...");
    }

    @Override
    public void plan() {
        System.out.println("plan ...");
    }

    @Override
    public void moYu(String name) {
        System.out.println(name + "在moyu ...");
    }

    @Override
    public void huaShui() {
        System.out.println("huashui ...");
    }
}
