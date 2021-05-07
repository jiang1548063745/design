package com.rorschach.pattern.delegate.simple;

/**
 * @author Rorschach
 * @date 2021-4-18 23:01
 */
public class Leader implements IEmployee{

    @Override
    public void doSomething(String task) {
        if ("spider".equals(task)) {
            new EmployeeA().doSomething(task);
        } else if ("ui".equals(task)) {
            new EmployeeB().doSomething(task);
        } else {
            System.out.println("No Employee So This Job");
        }
    }
}
