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

    private ICourse course;

    public Niu(ICourse course) {
        this.course = course;
    }

    public void studyImmocCourse() {
        this.course.studyCourse();
    }

    public void setCourse(ICourse course) {
        this.course = course;
    }
}
