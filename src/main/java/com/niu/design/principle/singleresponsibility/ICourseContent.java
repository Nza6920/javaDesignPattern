package com.niu.design.principle.singleresponsibility;

/**
 * 单一职责 - 课程内容管理
 *
 * @author [nza]
 * @version 1.0 [2020/07/17 13:58]
 * @createTime [2020/07/17 13:58]
 */
public interface ICourseContent {

    String getCourseName();

    byte[] getCourseVideo();
}
