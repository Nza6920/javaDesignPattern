package com.niu.design.pattern.behavioral.iterator;

import java.util.List;

/**
 * 迭代器模式
 *
 * @version 1.0 [2021/01/07 10:50]
 * @author [nza]
 * @createTime [2021/01/07 10:50]
 */
public class CourseIteratorImpl implements CourseIterator {

    private List<Course> courseList;

    private int position = 0;

    private Course course;

    public CourseIteratorImpl(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public Course nextCourse() {
        System.out.println("返回课程, 位置是: " + position);
        course = courseList.get(position);
        position++;
        return course;
    }

    @Override
    public boolean isLastCourse() {
        return position >= courseList.size();
    }
}
