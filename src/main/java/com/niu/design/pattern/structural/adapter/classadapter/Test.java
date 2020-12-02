package com.niu.design.pattern.structural.adapter.classadapter;

/**
 * 测试适配器模式
 *
 * @version 1.0 [2020/12/02 10:46]
 * @author [nza]
 * @createTime [2020/12/02 10:46]
 */
public class Test {

    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target target2 = new Adapter();
        target2.request();
    }
}
