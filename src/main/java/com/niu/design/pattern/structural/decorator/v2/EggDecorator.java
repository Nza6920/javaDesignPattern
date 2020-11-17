package com.niu.design.pattern.structural.decorator.v2;

/**
 * 装饰者模式
 * 鸡蛋装饰者
 *
 * @author [nza]
 * @version 1.0 [2020/11/17 15:07]
 * @createTime [2020/11/17 15:07]
 */
public class EggDecorator extends AbstractDecorator {

    public EggDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个煎蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
