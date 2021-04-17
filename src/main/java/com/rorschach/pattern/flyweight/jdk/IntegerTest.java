package com.rorschach.pattern.flyweight.jdk;

/**
 * @author Rorschach
 * @date 2021-4-14 23:04
 */
public class IntegerTest {

    public static void main(String[] args) {
        Integer a = 127;
        Integer b = Integer.valueOf(127);

        System.out.println(a == b);

        Integer c = 128;
        Integer d = Integer.valueOf(128);
        System.out.println(c == d);
    }
}
