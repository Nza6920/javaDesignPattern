package com.niu.design.principle.demeter;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 迪米特法则 - 队长
 *
 * @author [nza]
 * @version 1.0 [2020/07/17 14:44]
 * @createTime [2020/07/17 14:44]
 */
public class TeamLeader {

    public void checkNumberOfCourse() {
        List<Course> courses = Lists.newArrayList();

        for (int i = 0; i < 20; i++) {
            courses.add(new Course());
        }
        System.out.println("在线课程的数量是: " + courses.size());
    }
}
