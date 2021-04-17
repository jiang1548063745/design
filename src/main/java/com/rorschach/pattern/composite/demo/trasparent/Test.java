package com.rorschach.pattern.composite.demo.trasparent;

/**
 * @author Rorschach
 * @date 2021-4-15 21:16
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("======透明的组合模式======");
        CourseComponent javaBase = new Course("Java入门课程", 8280D);
        CourseComponent ai = new Course("人工智能课程", 5000);

        CourseComponent packageCourse = new CoursePackage("Java架构师课程", 2);

        CourseComponent design = new Course("Java设计模式课程", 1500);
        CourseComponent source = new Course("Java源码分析课程", 2000);

        ai.addChild(design);

        CourseComponent softSkill = new Course("软技能", 3000);

        packageCourse.addChild(design);
        packageCourse.addChild(source);
        packageCourse.addChild(softSkill);

        CourseComponent catLog = new CoursePackage("课程目录", 1);
        catLog.addChild(javaBase);
        catLog.addChild(ai);
        catLog.addChild(packageCourse);

        catLog.print();
    }
}
