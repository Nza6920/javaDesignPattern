package com.niu.design.pattern.behavioral.visitor;

/**
 * 访问者模式
 *
 * @version 1.0 [2021/01/08 10:00]
 * @author [nza]
 * @createTime [2021/01/08 10:00]
 */
public class FreeCourse extends Course {

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
