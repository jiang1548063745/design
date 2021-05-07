package com.rorschach.pattern.visitor.kpi;

import java.util.Random;

/**
 * @author Rorschach
 * @date 2021-5-7 22:01
 */
public class Manager extends Employee{

    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    /**
     * 考核指标: 产品数量
     * @return 产品研发数量
     */
    public int getProducts() {
        return new Random().nextInt(10);
    }
}
