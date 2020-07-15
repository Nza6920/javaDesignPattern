package com.niu.design.principle.dependenceinversion;

import lombok.extern.slf4j.Slf4j;

/**
 * 依赖倒置原则
 *
 * @author [nza]
 * @version 1.0 [2020/07/15 15:48]
 * @createTime [2020/07/15 15:48]
 */
@Slf4j
public class FeCourse implements ICourse {
    @Override
    public void studyCourse() {
        log.info("niu 在学习前端课程");
    }
}
