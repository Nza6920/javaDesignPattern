package com.niu.design.pattern.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * 责任链模式
 *
 * @version 1.0 [2021/01/08 09:37]
 * @author [nza]
 * @createTime [2021/01/08 09:37]
 */
public class VideoApprover extends Approver {

    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotEmpty(course.getVideo())) {
            System.out.println("存在视频: " + course.getName());

            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println("不存在视频: " + course.getName());
            System.out.println("流程结束");
        }
    }
}
