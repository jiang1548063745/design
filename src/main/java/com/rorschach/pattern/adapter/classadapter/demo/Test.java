package com.rorschach.pattern.adapter.classadapter.demo;

/**
 * @author Rorschach
 * @date 2021-4-17 0:29
 */
public class Test {

    public static void main(String[] args) {
        DC5 adapter = new PowerAdapter();
        adapter.optput5V();
    }
}
