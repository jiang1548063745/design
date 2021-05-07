package com.rorschach.pattern.delegate.simple;

/**
 * @author Rorschach
 * @date 2021-4-18 23:07
 */
public class Test {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.command("spider", new Leader());
        boss.command("ui", new Leader());
        boss.command("sale", new Leader());
    }
}
