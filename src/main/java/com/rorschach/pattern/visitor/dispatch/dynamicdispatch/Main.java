package com.rorschach.pattern.visitor.dispatch.dynamicdispatch;

/**
 * @author Rorschach
 * @date 2021-5-7 22:40
 */
public class Main {

    public static void main(String[] args) {
        IPerson man = new Man();
        IPerson women = new Women();

        man.test();
        women.test();

        // 动态分派
    }
}
