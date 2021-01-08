package com.niu.design.pattern.behavioral.visitor;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 访问者模式
 *
 * @author [nza]
 * @version 1.0 [2021/01/08 10:29]
 * @createTime [2021/01/08 10:29]
 */
public class Test {

    public static void main(String[] args) {
        List<Course> courseList = Lists.newArrayList();

        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("免费课程1");

        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("实战课程1");
        codingCourse.setPrice(1000);

        courseList.add(freeCourse);
        courseList.add(codingCourse);

        for (Course course : courseList) {
            course.accept(new Visitor());
        }
    }
}
