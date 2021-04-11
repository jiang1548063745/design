package com.rorschach.pattern.prototype.simple;

import java.util.ArrayList;

/**
 * @author Rorschach
 * @date 2021-4-6 22:05
 */
public class PrototypeTest {

    public static void main(String[] args) {
        ConcretePrototypeA item = new ConcretePrototypeA();
        item.setAge(18);
        item.setName("Tom");
        item.setHobbies(new ArrayList<>());

        ConcretePrototypeA copy = (ConcretePrototypeA) item.clone();

        System.out.println("克隆对象中引用类型地址的值: " + item.getHobbies());
        System.out.println("原对象中的引用类型地址的值: " + item.getHobbies());

        System.out.println("对象引用比较: " + (item.getHobbies() == copy.getHobbies()));
    }
}
