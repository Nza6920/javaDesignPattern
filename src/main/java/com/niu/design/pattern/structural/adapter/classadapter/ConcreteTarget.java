package com.niu.design.pattern.structural.adapter.classadapter;

/**
 * 适配器模式
 * 目标方法
 *
 * @version 1.0 [2020/12/02 10:43]
 * @author [nza]
 * @createTime [2020/12/02 10:43]
 */
public class ConcreteTarget extends Adaptee implements Target {
    @Override
    public void request() {
        super.adapteeRequest();
    }
}
