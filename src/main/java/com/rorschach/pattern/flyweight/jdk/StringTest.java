package com.rorschach.pattern.flyweight.jdk;

/**
 * @author Rorschach
 * @date 2021-4-14 22:52
 */
public class StringTest {

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "he" + "llo";
        String s4 = "hel" + new String("lo");
        String s5 = new String("hello");
        String s6 = s5.intern();
        String s7 = "he";
        String s8 = "llo";
        String s9 = s7 + s8; // Java在编译期 只对常量做处理  不对变量做处理

        System.out.println(s1 == "hello");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);
        System.out.println(s1 == s9);
    }
}
