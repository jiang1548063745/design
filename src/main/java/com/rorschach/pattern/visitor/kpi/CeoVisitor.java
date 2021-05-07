package com.rorschach.pattern.visitor.kpi;

/**
 * @author Rorschach
 * @date 2021-5-7 22:11
 */
public class CeoVisitor implements IVisitor{

    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师: " + engineer.getName() + ", KPI: " + engineer.getKpi());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理: " + manager.getName() + ", KPI: " + manager.getKpi());
    }
}
