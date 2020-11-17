package com.niu.design.pattern.creational.prototype.abstractprototype;

/**
 * 原型模式
 * A
 *
 * @version 1.0 [2020/11/17 13:21]
 * @author [nza]
 * @createTime [2020/11/17 13:21]
 */
public abstract class A implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
