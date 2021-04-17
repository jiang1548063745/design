package com.rorschach.pattern.adapter.classadapter;

/**
 * @author Rorschach
 * @date 2021-4-17 0:20
 */
public class Adapter extends Adaptee implements Target{

    @Override
    public int request() {
        return 0;
    }
}
