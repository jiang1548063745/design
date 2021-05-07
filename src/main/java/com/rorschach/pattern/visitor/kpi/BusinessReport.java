package com.rorschach.pattern.visitor.kpi;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Rorschach
 * @date 2021-5-7 22:18
 */
public class BusinessReport {

    private List<Employee> employees = new LinkedList<>();

    public BusinessReport() {
        employees.add(new Manager("产品经理A"));
        employees.add(new Engineer("工程师A"));
        employees.add(new Engineer("工程师B"));
        employees.add(new Engineer("工程师C"));
        employees.add(new Manager("产品经理B"));
        employees.add(new Engineer("工程师D"));
    }

    public void showReport(IVisitor visitor) {
        for (Employee employee : employees) {
            employee.accept(visitor);
        }
    }
}
