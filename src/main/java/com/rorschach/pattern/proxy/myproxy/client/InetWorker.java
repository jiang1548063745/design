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
    public void moYu() {
        System.out.println("moyu ...");
    }

    @Override
    public void huaShui() {
        System.out.println("huashui ...");
    }
}
