package com.niu.design.principle.singleresponsibility;

/**
 * 单一职责 - 课程实现类
 *
 * @version 1.0 [2020/07/17 14:00]
 * @author [nza]
 * @createTime [2020/07/17 14:00]
 */
public class CourseImpl implements ICourseManager, ICourseContent {
    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
