package com.niu.design.pattern.structural.decorator.v2;

/**
 * 装饰者模式
 * 香肠装饰者
 *
 * @author [nza]
 * @version 1.0 [2020/11/17 15:07]
 * @createTime [2020/11/17 15:07]
 */
public class SausageDecorator extends AbstractDecorator {

    public SausageDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
