package com.niu.design.pattern.creational.builder;

/**
 * 课程教练
 *
 * @author [nza]
 * @version 1.0 [2020/10/27 16:50]
 * @createTime [2020/10/27 16:50]
 */
public class Coach {

    private CourseBuilder courseBuilder;

    public Coach(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String name, String ppt, String video, String article, String qa) {
        courseBuilder.buildName(name);
        courseBuilder.buildPPt(ppt);
        courseBuilder.buildVideo(video);
        courseBuilder.buildArticle(article);
        courseBuilder.buildQA(qa);

        return courseBuilder.makeCourse();
    }
}
