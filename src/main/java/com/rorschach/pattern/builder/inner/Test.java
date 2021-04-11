package com.rorschach.pattern.builder.inner;

import java.util.Date;

/**
 * @author Rorschach
 * @date 2021-4-10 23:32
 */
public class Test {

    public static void main(String[] args) {
        Project project = Project.builder()
                .projectName("测试项目")
                .projectDate(new Date())
                .projectDuty("测试职责")
                .build();

        System.out.println(project);
    }
}
