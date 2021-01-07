package com.niu.design.pattern.behavioral.iterator;

/**
 * 迭代器模式
 *
 * @author [nza]
 * @version 1.0 [2021/01/07 10:43]
 * @createTime [2021/01/07 10:43]
 */
public interface CourseAggregate {

    /**
     * 增加课程
     *
     * @param course 课程
     */
    void addCourse(Course course);

    /**
     * 移除课程
     *
     * @param course 课程
     */
    void removeCourse(Course course);

    /**
     * 获取课程迭代器
     *
     * @return kec
     */
    CourseIterator getCourseIterator();
}
