package com.rorschach.pattern.visitor.kpi;

/**
 * @author Rorschach
 * @date 2021-5-7 22:23
 */
public class Test {

    public static void main(String[] args) {
        BusinessReport businessReport = new BusinessReport();

        System.out.println("============CEO=================");
        businessReport.showReport(new CeoVisitor());

        System.out.println("============CTO=================");
        businessReport.showReport(new CtoVisitor());
    }
}
