package com.rorschach.pattern.visitor.kpi;

/**
 * @author Rorschach
 * @date 2021-5-7 22:07
 */
public class CtoVisitor implements IVisitor{

    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师: " + engineer.getName() + ", 代码行数: " + engineer.getCodeLines());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理: " + manager.getName() + ", 产品数量: " + manager.getProducts());
    }
}
