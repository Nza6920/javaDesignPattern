package com.niu.design.pattern.structural.decorator.v2;

/**
 * 建造者模式
 * 抽象
 *
 * @version 1.0 [2020/11/17 15:02]
 * @author [nza]
 * @createTime [2020/11/17 15:02]
 */
public class BatterCake extends ABatterCake {

    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
