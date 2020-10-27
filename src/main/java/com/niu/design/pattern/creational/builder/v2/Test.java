package com.niu.design.pattern.creational.builder.v2;

/**
 * 构建者模式V2
 *
 * @version 1.0 [2020/10/27 17:03]
 * @author [nza]
 * @createTime [2020/10/27 17:03]
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildName("name")
                .builderVideo("video")
                .builderQa("qa")
                .builderPPt("ppt")
                .builderArticle("article")
                .build();
        System.out.println(course);
    }
}
