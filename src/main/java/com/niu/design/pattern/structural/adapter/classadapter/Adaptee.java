package com.niu.design.pattern.structural.adapter.classadapter;

/**
 * 适配器模式
 * 被适配者
 *
 * @version 1.0 [2020/12/02 10:41]
 * @author [nza]
 * @createTime [2020/12/02 10:41]
 */
public class Adaptee {
    public void adapteeRequest() {
        System.out.println("被适配者的方法");
    }
}
