package com.rorschach.pattern.composite.demo.safe;

/**
 * @author Rorschach
 * @date 2021-4-15 21:25
 */
public abstract class Directory {

    protected String name;

    public Directory(String name) {
        this.name = name;
    }

    /**
     * 展示方法
     */
    public abstract void show();
}
