package com.rorschach.pattern.builder.simple;

/**
 * @author Rorschach
 * @date 2021-4-10 14:14
 */
public class CourseBuilder {

    private Course course = new Course();

    public CourseBuilder name(String name) {
        this.course.setName(name);
        return this;
    }

    public CourseBuilder note(String note) {
        this.course.setNote(note);
        return this;
    }

    public CourseBuilder ppt(String ppt) {
        this.course.setPpt(ppt);
        return this;
    }

    public CourseBuilder video(String video) {
        this.course.setVideo(video);
        return this;
    }

    public Course builder() {
        return course;
    }
}
