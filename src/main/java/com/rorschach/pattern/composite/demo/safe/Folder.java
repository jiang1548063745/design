package com.rorschach.pattern.composite.demo.safe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rorschach
 * @date 2021-4-15 21:27
 */
public class Folder extends Directory{

    private List<Directory> dirs;

    private Integer level;

    public Folder(String name, Integer level) {
        super(name);
        this.level = level;
        this.dirs = new ArrayList<>();
    }

    @Override
    public void show() {
        System.out.println(this.name);

        for (Directory directory: dirs) {
            if (null != this.level) {
                for (int i = 0; i < this.level; i++) {
                    System.out.print("   ");
                }

                for (int i = 0; i < this.level; i++) {
                    if (i == 0) {
                        System.out.print("+");
                    }
                    System.out.print("-");
                }
            }
            directory.show();
        }
    }

    public boolean add(Directory dir) {
        return this.dirs.add(dir);
    }

    public boolean remove(Directory dir) {
        return this.dirs.remove(dir);
    }

    public Directory get(int index) {
        return this.dirs.get(index);
    }

    public void list() {
        for (Directory directory: dirs) {
            System.out.println(directory.name);
        }
    }
}
