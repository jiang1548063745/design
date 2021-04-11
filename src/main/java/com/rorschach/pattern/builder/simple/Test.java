package com.rorschach.pattern.builder.simple;

/**
 * @author Rorschach
 * @date 2021-4-10 14:35
 */
public class Test {

    public static void main(String[] args) {
//        CourseBuilder courseBuilder = new CourseBuilder();
//        courseBuilder.name("name");
//        courseBuilder.ppt("ppt");
//        courseBuilder.note("note");
//        courseBuilder.video("video");
//        System.out.println(courseBuilder.builder());

        CourseBuilder courseBuilder = new CourseBuilder()
                .name("name")
                .ppt("ppt")
                .note("note")
                .video("video");
        System.out.println(courseBuilder.builder());
    }
}
