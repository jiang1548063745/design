package com.rorschach.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rorschach
 * @date 2021-4-21 21:09
 */
public class CourseAggregateImpl implements ICourseAggregate{

    private List<Course> courseList;

    public CourseAggregateImpl() {
        this.courseList = new ArrayList<>();
    }

    @Override
    public void add(Course course) {
        courseList.add(course);
    }

    @Override
    public void remove(Course course) {
        courseList.remove(course);
    }

    @Override
    public Iterator<Course> iterator() {
        return new IteratorImpl<>(courseList);
    }
}
