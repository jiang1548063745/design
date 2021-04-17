package com.rorschach.pattern.composite.demo.trasparent;

/**
 * @author Rorschach
 * @date 2021-4-15 20:59
 */
public class Course extends CourseComponent{

    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CourseComponent component) {
        return this.name;
    }

    @Override
    public double getPrice(CourseComponent component) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("name:" + this.name + " price:" + this.price);
    }
}
