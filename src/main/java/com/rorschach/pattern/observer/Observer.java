package com.rorschach.pattern.observer;

/**
 * @author Rorschach
 * @date 2021-5-7 23:00
 */
public abstract class Observer {

    protected Subject subject;

    /**
     * 更新方法
     */
    public abstract void update();
}
