package com.niu.design.pattern.behavioral.visitor;

/**
 * 访问者模式
 *
 * @version 1.0 [2021/01/08 10:22]
 * @author [nza]
 * @createTime [2021/01/08 10:22]
 */
public interface IVisitor {

    void visit(FreeCourse course);

    void visit(CodingCourse course);
}
