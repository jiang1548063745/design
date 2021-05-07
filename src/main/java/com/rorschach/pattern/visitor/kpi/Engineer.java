package com.rorschach.pattern.visitor.kpi;

import java.util.Random;

/**
 * @author Rorschach
 * @date 2021-5-7 21:59
 */
public class Engineer extends Employee{

    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    /**
     * 考核指标 代码量
     * @return 代码量
     */
    public int getCodeLines() {
        return new Random().nextInt(10 * 10000);
    }
}
