package com.niu.design.pattern.creational.abstractfactory;

/**
 * Java 课程工厂
 *
 * @author [nza]
 * @version 1.0 [2020/10/27 16:08]
 * @createTime [2020/10/27 16:08]
 */
public class JavaCourseFactory implements CourseFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
