package com.rorschach.pattern.delegate.simple;

/**
 * @author Rorschach
 * @date 2021-4-18 23:02
 */
public class Boss {

    public void command(String task, Leader leader) {
        leader.doSomething(task);
    }
}
