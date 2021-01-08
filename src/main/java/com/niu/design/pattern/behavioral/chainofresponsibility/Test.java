package com.niu.design.pattern.behavioral.chainofresponsibility;

/**
 * 责任链模式
 *
 * @version 1.0 [2021/01/08 09:40]
 * @author [nza]
 * @createTime [2021/01/08 09:40]
 */
public class Test {
    public static void main(String[] args) {
        Approver articleApprover = new ArticleApprover();

        Approver videoApprover = new VideoApprover();

        Course course = new Course();
        course.setName("Java");
        course.setArticle("Java手记Java手记Java手记Java手记");
        course.setVideo("Java视频Java视频Java视频Java视频Java视频");

        // 设置下一链条
        articleApprover.setNextApprover(videoApprover);

        articleApprover.deploy(course);
    }
}
