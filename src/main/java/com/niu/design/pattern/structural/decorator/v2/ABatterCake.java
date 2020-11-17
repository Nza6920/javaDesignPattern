package com.niu.design.pattern.structural.decorator.v2;

/**
 * 建造者模式
 * 抽象煎饼
 *
 * @author [nza]
 * @version 1.0 [2020/11/17 15:00]
 * @createTime [2020/11/17 15:00]
 */
public abstract class ABatterCake {

    protected abstract String getDesc();

    protected abstract int cost();
}
