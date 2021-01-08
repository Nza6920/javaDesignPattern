package com.niu.design.pattern.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * 责任链模式
 *
 * @version 1.0 [2021/01/08 09:34]
 * @author [nza]
 * @createTime [2021/01/08 09:34]
 */
public class ArticleApprover extends Approver {

    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotEmpty(course.getArticle())) {
            System.out.println("存在手记: " + course.getName());

            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println("不存在手记: " + course.getName());
            System.out.println("流程结束");
        }
    }
}

