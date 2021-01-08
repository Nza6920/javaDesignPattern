package com.niu.design.pattern.behavioral.visitor;

/**
 * 访问者模式
 *
 * @version 1.0 [2021/01/08 10:01]
 * @author [nza]
 * @createTime [2021/01/08 10:01]
 */
public abstract class Course {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 访问
     * @param visitor
     */
    public abstract void accept(IVisitor visitor);

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }
}
