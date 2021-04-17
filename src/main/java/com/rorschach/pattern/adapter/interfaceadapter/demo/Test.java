package com.rorschach.pattern.adapter.interfaceadapter.demo;

/**
 * @author Rorschach
 * @date 2021-4-17 0:41
 */
public class Test {

    public static void main(String[] args) {
        DC adapter = new PowerAdapter(new AC220());

        adapter.output5V();
        adapter.output12V();
    }
}
