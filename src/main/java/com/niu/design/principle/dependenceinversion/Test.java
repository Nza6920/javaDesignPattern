package com.niu.design.principle.dependenceinversion;

/**
 * 依赖倒置原则 - 测试类
 *
 * @author [nza]
 * @version 1.0 [2020/07/15 15:33]
 * @createTime [2020/07/15 15:33]
 */
public class Test {
    public static void main(String[] args) {
        Niu niu = new Niu();
        niu.studyFeCourse();
        niu.studyJavaCourse();
    }
}
