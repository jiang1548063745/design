package com.rorschach.pattern.prototype.deep;

import java.util.ArrayList;

/**
 * @author Rorschach
 * @date 2021-4-6 22:49
 */
public class DeepTest {

    public static void main(String[] args) {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setAge(18);
        concretePrototype.setName("Test");
        concretePrototype.setHobbies(new ArrayList<String>());
        System.out.println("prototype: " +concretePrototype.getHobbies());

        ConcretePrototype copy = concretePrototype.clone();
        System.out.println("copy: " + copy.getHobbies());

        System.out.println(copy.getHobbies() == concretePrototype.getHobbies());
        // true

        ConcretePrototype deepPrototype = new ConcretePrototype();
        deepPrototype.setAge(18);
        deepPrototype.setName("Test");
        deepPrototype.setHobbies(new ArrayList<String>());
        System.out.println("deep prototype: " +concretePrototype.getHobbies());

        ConcretePrototype deepCopy = concretePrototype.deepClone();
        System.out.println("deep copy: " + deepCopy.getHobbies());

        System.out.println(deepCopy.getHobbies() == deepPrototype.getHobbies());
    }
}
