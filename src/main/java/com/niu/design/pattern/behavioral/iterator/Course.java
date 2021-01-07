package com.niu.design.pattern.behavioral.iterator;

/**
 * 迭代器模式
 * 课程
 *
 * @author [nza]
 * @version 1.0 [2021/01/07 10:42]
 * @createTime [2021/01/07 10:42]
 */
public class Course {

    public Course(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }
}
