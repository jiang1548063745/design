package com.rorschach.pattern.delegate.simple;

/**
 * @author Rorschach
 * @date 2021-4-18 23:02
 */
public class EmployeeB implements IEmployee{

    protected String goodAt = "design";

    @Override
    public void doSomething(String task) {
        System.out.println("B:" + goodAt + ", begin " + task);
    }
}
