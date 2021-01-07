package com.niu.design.pattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者模式
 *
 * 教师
 *
 * @version 1.0 [2021/01/07 14:14]
 * @author [nza]
 * @createTime [2021/01/07 14:14]
 */
public class Teacher implements Observer {

    /**
     * 教师名称
     */
    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    @Override
    public void update(Observable o, Object q) {
        Course course = (Course) o;
        Question question = (Question) q;

        System.out.println("观察者: " + teacherName);
        System.out.println("课程: " + course);
        System.out.println("问题: " + question);
    }
}
