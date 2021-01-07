package com.niu.design.pattern.behavioral.iterator;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 迭代器模式
 *
 * @version 1.0 [2021/01/07 10:48]
 * @author [nza]
 * @createTime [2021/01/07 10:48]
 */
public class CourseAggregateImpl implements CourseAggregate {

    private List<Course> courseList;

    public CourseAggregateImpl() {
        this.courseList = Lists.newArrayList();
    }

    @Override
    public void addCourse(Course course) {
        courseList.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        courseList.remove(course);
    }

    @Override
    public CourseIterator getCourseIterator() {
        return new CourseIteratorImpl(courseList);
    }
}
