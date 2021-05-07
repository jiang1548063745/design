package com.rorschach.pattern.interpreter.calculate;

/**
 * @author Rorschach
 * @date 2021-4-28 20:32
 */
public class Test {

    public static void main(String[] args) {

        System.out.println(new Calculator("10 + 30").calculate());

        System.out.println(new Calculator("10 + 30 - 20").calculate());

        System.out.println(new Calculator("100 * 2 + 400 * 1 + 66").calculate());

        // 不支持四则运算
        System.out.println(new Calculator("200 * 2 + 400 / 2").calculate());
    }
}
