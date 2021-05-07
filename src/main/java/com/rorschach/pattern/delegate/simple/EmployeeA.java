package com.rorschach.pattern.delegate.simple;

/**
 * @author Rorschach
 * @date 2021-4-18 23:02
 */
public class EmployeeA implements IEmployee{

    protected String goodAt = "coding";

    @Override
    public void doSomething(String task) {
        System.out.println("A:" + goodAt + ", begin " + task);
    }
}
