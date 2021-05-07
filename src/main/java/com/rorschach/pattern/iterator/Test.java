package com.rorschach.pattern.iterator;

/**
 * @author Rorschach
 * @date 2021-4-21 21:11
 */
public class Test {

    public static void main(String[] args) {
        Course java = new Course("java");

        Course node = new Course("nodeJs");

        Course python = new Course("python");

        Course ruby = new Course("ruby");

        ICourseAggregate courseAggregate = new CourseAggregateImpl();
        courseAggregate.add(java);
        courseAggregate.add(node);
        courseAggregate.add(python);
        courseAggregate.add(ruby);

        System.out.println("=================== course list ==========================");

        printCourse(courseAggregate);

        courseAggregate.remove(ruby);

        System.out.println("=================== after remove course list ==========================");

        printCourse(courseAggregate);
    }

    private static void printCourse(ICourseAggregate courseAggregate) {
        Iterator<Course> iterator = courseAggregate.iterator();
        while (iterator.hasNext()) {
            Course course = iterator.next();
            System.out.println("Course: " + course.getName());
        }
    }
}
