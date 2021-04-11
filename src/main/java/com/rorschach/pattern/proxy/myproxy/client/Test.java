package com.rorschach.pattern.proxy.myproxy.client;

/**
 * @author Rorschach
 * @date 2021-4-11 21:59
 */
public class Test {

    public static void main(String[] args) {
        ProxyClient proxyClient = new ProxyClient();
        IWorker worker = proxyClient.getInstance(new InetWorker());

        worker.work();

        worker.plan();

        IMoyu moyu = (IMoyu)worker;
        moyu.moYu("小咸鱼");

        moyu.huaShui();
    }
}
