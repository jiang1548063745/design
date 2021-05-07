package com.rorschach.pattern.visitor.kpi;

import java.util.Random;

/**
 * @author Rorschach
 * @date 2021-5-7 21:56
 */
public abstract class Employee {

    /**
     * 员工名称
     */
    private String name;

    /**
     * kpi
     */
    private int kpi;

    public Employee(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }

    /**
     * 接受访问者的访问
     * @param visitor 访问器
     */
    public abstract void accept(IVisitor visitor);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKpi() {
        return kpi;
    }

    public void setKpi(int kpi) {
        this.kpi = kpi;
    }
}
