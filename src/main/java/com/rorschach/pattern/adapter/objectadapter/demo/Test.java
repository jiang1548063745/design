package com.rorschach.pattern.adapter.objectadapter.demo;

/**
 * @author Rorschach
 * @date 2021-4-17 0:29
 */
public class Test {

    public static void main(String[] args) {
        DC5 adapter = new PowerAdapter(new AC220());
        adapter.optput5V();
    }
}
