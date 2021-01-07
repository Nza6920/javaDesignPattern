package com.niu.design.pattern.behavioral.observer;

import java.util.Observable;

/**
 * 观察者模式
 *
 * 课程
 *
 * @version 1.0 [2021/01/07 14:12]
 * @author [nza]
 * @createTime [2021/01/07 14:12]
 */
public class Course extends Observable {

    public Course(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void produceQuestion(Course course, Question question) {
        System.out.println("课程: " + course);
        System.out.println("问题: " + question);

        setChanged();
        notifyObservers(question);
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }
}
