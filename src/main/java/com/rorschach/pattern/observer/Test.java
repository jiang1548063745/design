package com.rorschach.pattern.observer;

/**
 * @author Rorschach
 * @date 2021-5-7 23:05
 */
public class Test {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);

        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
