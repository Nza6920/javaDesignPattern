package com.niu.design.pattern.behavioral.visitor;

/**
 * 访问者模式
 *
 * @version 1.0 [2021/01/08 10:26]
 * @author [nza]
 * @createTime [2021/01/08 10:26]
 */
public class Visitor implements IVisitor {
    @Override
    public void visit(FreeCourse course) {
        System.out.println("免费课程: " + course);
    }

    @Override
    public void visit(CodingCourse course) {
        System.out.println("实战课程: " + course);
    }
}
