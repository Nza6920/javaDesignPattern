package com.niu.design.pattern.creational.builder;

/**
 * 课程构建器实现类
 *
 * @version 1.0 [2020/10/27 16:46]
 * @author [nza]
 * @createTime [2020/10/27 16:46]
 */
public class CourseBuildImpl extends CourseBuilder {

    private Course course = new Course();

    @Override
    public void buildName(String name) {
        course.setName(name);
    }

    @Override
    public void buildPPt(String ppt) {
        course.setPpt(ppt);
    }

    @Override
    public void buildQA(String qa) {
        course.setQa(qa);
    }

    @Override
    public void buildVideo(String video) {
        course.setVideo(video);
    }

    @Override
    public void buildArticle(String article) {
        course.setArticle(article);
    }

    @Override
    public Course makeCourse() {
        return course;
    }
}
