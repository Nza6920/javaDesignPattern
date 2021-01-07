package com.niu.design.pattern.behavioral.iterator;

/**
 * 迭代器模式
 * 课程迭代器
 *
 * @author [nza]
 * @version 1.0 [2021/01/07 10:46]
 * @createTime [2021/01/07 10:46]
 */
public interface CourseIterator {

    /**
     * 获取下一个课程
     *
     * @return 课程
     */
    Course nextCourse();

    /**
     * 是否是最后一个课程
     *
     * @return boolean
     */
    boolean isLastCourse();
}
