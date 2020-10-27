package com.niu.design.pattern.creational.abstractfactory;

/**
 * 抽象工厂 产品族
 *
 * @author [nza]
 * @version 1.0 [2020/10/27 16:15]
 * @createTime [2020/10/27 16:15]
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();

        Article article = courseFactory.getArticle();
        article.produce();

        Video video = courseFactory.getVideo();
        video.produce();
    }
}
