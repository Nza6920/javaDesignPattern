package com.niu.design.pattern.structural.decorator.v2;

/**
 * 装饰者模式
 * 测试类
 *
 * @author [nza]
 * @version 1.0 [2020/11/17 15:10]
 * @createTime [2020/11/17 15:10]
 */
public class Test {

    public static void main(String[] args) {
        ABatterCake aBatterCake;

        aBatterCake = new BatterCake();
        aBatterCake = new EggDecorator(aBatterCake);
        aBatterCake = new SausageDecorator(aBatterCake);

        System.out.println(aBatterCake.getDesc());
    }
}
