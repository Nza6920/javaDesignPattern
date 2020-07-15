package com.niu.design.principle.dependenceinversion;

import lombok.extern.slf4j.Slf4j;

/**
 * 依赖倒置原则
 *
 * @author [nza]
 * @version 1.0 [2020/07/15 15:32]
 * @createTime [2020/07/15 15:32]
 */
@Slf4j
public class Niu {

    public void studyJavaCourse() {
        log.info("niu 在学习java课程");
    }

    public void studyFeCourse() {
        log.info("niu 在学习前端课程");
    }
}
