package com.niu.design.pattern.behavioral.visitor;

/**
 * 访问者模式
 *
 * @author [nza]
 * @version 1.0 [2021/01/08 10:00]
 * @createTime [2021/01/08 10:00]
 */
public class CodingCourse extends Course {

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
