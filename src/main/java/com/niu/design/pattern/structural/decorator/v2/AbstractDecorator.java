package com.niu.design.pattern.structural.decorator.v2;

/**
 * 装饰者模式
 *
 * @version 1.0 [2020/11/17 15:03]
 * @author [nza]
 * @createTime [2020/11/17 15:03]
 */
public class AbstractDecorator extends ABatterCake {

    private ABatterCake aBatterCake;

    public AbstractDecorator(ABatterCake aBatterCake) {
        this.aBatterCake = aBatterCake;
    }

    @Override
    protected String getDesc() {
        return aBatterCake.getDesc();
    }

    @Override
    protected int cost() {
        return aBatterCake.cost();
    }
}
