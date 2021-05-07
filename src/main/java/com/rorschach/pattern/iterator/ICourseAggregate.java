package com.rorschach.pattern.iterator;

/**
 * @author Rorschach
 * @date 2021-4-21 21:02
 */
public interface ICourseAggregate {

    void add(Course course);

    void remove(Course course);

    Iterator<Course> iterator();
}
