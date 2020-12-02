package com.niu.design.pattern.structural.adapter.classadapter;

/**
 * 适配器模式
 *
 * @version 1.0 [2020/12/02 10:48]
 * @author [nza]
 * @createTime [2020/12/02 10:48]
 */
public class Adapter extends Adaptee implements Target{

    @Override
    public void request() {
        super.adapteeRequest();
    }
}
