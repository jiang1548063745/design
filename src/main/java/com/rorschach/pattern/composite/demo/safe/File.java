package com.rorschach.pattern.composite.demo.safe;

/**
 * @author Rorschach
 * @date 2021-4-15 21:27
 */
public class File extends Directory{
    public File(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println(this.name);
    }
}
