package com.niu.design.pattern.behavioral.templatemethod;

/**
 * 模板方法
 *
 * @version 1.0 [2020/12/24 14:07]
 * @author [nza]
 * @createTime [2020/12/24 14:07]
 */
public class DesignPatternCourse extends ACourse{
    @Override
    void packageCourse() {
        System.out.println("提供课程Java源码");
    }
}
