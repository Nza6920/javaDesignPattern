package com.niu.design.pattern.creational.builder;

/**
 * 课程建造器
 *
 * @author [nza]
 * @version 1.0 [2020/10/27 16:42]
 * @createTime [2020/10/27 16:42]
 */
public abstract class CourseBuilder {

    /**
     * 构建名称
     *
     * @param name 名称
     * @author nza
     * @createTime 2020/10/27 16:43
     */
    public abstract void buildName(String name);

    /**
     * 构建ppt
     *
     * @param ppt PPT
     * @author nza
     * @createTime 2020/10/27 16:43
     */
    public abstract void buildPPt(String ppt);

    /**
     * 构建问答
     *
     * @param qa 问答
     * @author nza
     * @createTime 2020/10/27 16:43
     */
    public abstract void buildQA(String qa);

    /**
     * 构建视频
     *
     * @param video 视频
     * @author nza
     * @createTime 2020/10/27 16:43
     */
    public abstract void buildVideo(String video);

    /**
     * 构建文章
     *
     * @param article 文章
     * @author nza
     * @createTime 2020/10/27 16:43
     */
    public abstract void buildArticle(String article);

    /**
     * 创建课程
     *
     * @author nza
     * @createTime 2020/10/27 16:46
     * @return    {@link com.niu.design.pattern.creational.builder.Course} 课程
     */
    public abstract Course makeCourse();
}
