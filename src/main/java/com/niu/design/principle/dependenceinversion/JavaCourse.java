package com.niu.design.principle.dependenceinversion;

import lombok.extern.slf4j.Slf4j;

/**
 * 依赖倒置原则
 *
 * @author [nza]
 * @version 1.0 [2020/07/15 15:47]
 * @createTime [2020/07/15 15:47]
 */
@Slf4j
public class JavaCourse implements ICourse {

    @Override
    public void studyCourse() {
        log.info("niu 在学习Java课程");
    }
}
