package com.niu.design.principle.openclose;

import lombok.extern.slf4j.Slf4j;

/**
 * 开闭原则 - 测试类
 *
 * @author [nza]
 * @version 1.0 [2020/07/15 14:58]
 * @createTime [2020/07/15 14:58]
 */
@Slf4j
public class Test {

    public static void main(String[] args) {
        // 创建课程
        ICourse course1 = new JavaCourse(1, "java 课程", 123d);
        log.info("课程id： {}， 课程名称： {}， 课程价格： {}", course1.getId(), course1.getName(), course1.getPrice());

        // 创建打折课程
        ICourse course2 = new JavaDiscountCourse(1, "java 课程", 123d);
        JavaDiscountCourse discountCourse = (JavaDiscountCourse) course2;
        log.info("课程id： {}， 课程名称： {}， 课程价格： {}, 课程原价： {}",
                discountCourse.getId(),
                discountCourse.getName(),
                discountCourse.getPrice(),
                discountCourse.getOriginPrice());
    }
}
