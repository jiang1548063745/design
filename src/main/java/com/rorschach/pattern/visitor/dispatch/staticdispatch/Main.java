package com.rorschach.pattern.visitor.dispatch.staticdispatch;

/**
 * @author Rorschach
 * @date 2021-5-7 22:32
 */
public class Main {

    public void test(String string) {
        System.out.println("String:" + string);
    }

    public void test(Integer integer) {
        System.out.println("Integer:" + integer);
    }

    public static void main(String[] args) {
        String str = "str";
        Integer integer = 1;

        Main main = new Main();
        main.test(str);
        main.test(integer);

        // 静态分派
    }
}
