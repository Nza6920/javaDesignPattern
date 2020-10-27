package com.niu.design.pattern.creational.builder;

/**
 * 建造者模式
 *
 * @author [nza]
 * @version 1.0 [2020/10/27 16:54]
 * @createTime [2020/10/27 16:54]
 */
public class Test {

    public static void main(String[] args) {
        CourseBuilder builder = new CourseBuildImpl();
        Coach coach = new Coach(builder);
        Course course = coach.makeCourse("name", "ppt", "video", "article", "qa");
        System.out.println(course);
    }
}
