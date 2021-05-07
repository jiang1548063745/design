package com.rorschach.pattern.observer;

/**
 * @author Rorschach
 * @date 2021-5-7 23:02
 */
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) );
    }
}
