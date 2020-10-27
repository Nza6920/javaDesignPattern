package com.niu.design.pattern.creational.builder.v2;

/**
 * 课程
 *
 * @author [nza]
 * @version 1.0 [2020/10/27 16:39]
 * @createTime [2020/10/27 16:39]
 */
public class Course {

    public Course(CourseBuilder courseBuilder) {
        this.name = courseBuilder.name;
        this.ppt = courseBuilder.ppt;
        this.qa = courseBuilder.qa;
        this.video = courseBuilder.video;
        this.article = courseBuilder.article;
    }

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

    public static class CourseBuilder {

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

        public CourseBuilder buildName(String name) {
            this.name = name;
            return this;
        }

        public CourseBuilder builderQa(String qa) {
            this.qa = qa;
            return this;
        }

        public CourseBuilder builderVideo(String video) {
            this.video = video;
            return this;
        }

        public CourseBuilder builderArticle(String article) {
            this.article = article;
            return this;
        }

        public CourseBuilder builderPPt(String ppt) {
            this.ppt = ppt;
            return this;
        }

        public Course build() {
            return new Course(this);
        }
    }
}
