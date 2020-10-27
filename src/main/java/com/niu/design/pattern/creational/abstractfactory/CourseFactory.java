package com.niu.design.pattern.creational.abstractfactory;

/**
 * 抽象课程工厂
 *
 * @author [nza]
 * @version 1.0 [2020/10/27 15:58]
 * @createTime [2020/10/27 15:58]
 */
public interface CourseFactory {

    /**
     * 获取视频
     *
     * @return {@link Video}
     * @author nza
     * @createTime 2020/10/27 16:00
     */
    Video getVideo();

    /**
     * 获取文章
     *
     * @return {@link Article}
     * @author nza
     * @createTime 2020/10/27 16:01
     */
    Article getArticle();
}
