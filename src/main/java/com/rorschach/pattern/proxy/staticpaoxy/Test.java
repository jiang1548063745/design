package com.rorschach.pattern.proxy.staticpaoxy;

/**
 * @author Rorschach
 * @date 2021-4-11 0:35
 */
public class Test {

    public static void main(String[] args) {
        ZhangSan zhangSan = new ZhangSan();

        ZhangLaoSan zhangLaoSan = new ZhangLaoSan(zhangSan);
        zhangLaoSan.findLove();
    }
}
