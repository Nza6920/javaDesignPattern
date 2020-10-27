package com.niu.design.pattern.creational.builder;

/**
 * 课程
 *
 * @version 1.0 [2020/10/27 16:39]
 * @author [nza]
 * @createTime [2020/10/27 16:39]
 */
public class Course {

    /**
     * 课程名称
     */
    private String name;

    /**
     * ppt
     */
    private String ppt;

    /**
     * 问题 及 答案
     */
    private String qa;

    /**
     * 视频
     */
    private String video;

    /**
     * 文章
     */
    private String article;

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", ppt='" + ppt + '\'' +
                ", qa='" + qa + '\'' +
                ", video='" + video + '\'' +
                ", article='" + article + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPpt() {
        return ppt;
    }

    public void setPpt(String ppt) {
        this.ppt = ppt;
    }

    public String getQa() {
        return qa;
    }

    public void setQa(String qa) {
        this.qa = qa;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }
}
