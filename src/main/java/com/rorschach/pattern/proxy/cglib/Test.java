package com.rorschach.pattern.proxy.cglib;

/**
 * @author Rorschach
 * @date 2021-4-11 1:15
 */
public class Test {

    public static void main(String[] args) {
        ZhangSan zhangSanProxy = (ZhangSan) new CglibMeiPo().getInstance(new ZhangSan());
        zhangSanProxy.findLove();
    }
}
