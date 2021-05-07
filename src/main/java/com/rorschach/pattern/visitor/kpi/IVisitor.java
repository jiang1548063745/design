package com.rorschach.pattern.visitor.kpi;

/**
 * @author Rorschach
 * @date 2021-5-7 21:58
 */
public interface IVisitor {

    /**
     * 访问方法
     * @param engineer 工程师
     */
    void visit(Engineer engineer);

    /**
     * 访问方法
     * @param manager 管理
     */
    void visit(Manager manager);

//    void visit(Employee employee) {
//        if (employee instanceof Manager) {
//            System.out.println();
//        } else {
//            System.out.println();
//        }
//    }
}
