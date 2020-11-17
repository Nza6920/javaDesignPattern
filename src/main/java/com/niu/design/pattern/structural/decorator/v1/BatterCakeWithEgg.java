package com.niu.design.pattern.structural.decorator.v1;

/**
 * 加蛋煎饼
 *
 * @version 1.0 [2020/11/17 14:53]
 * @author [nza]
 * @createTime [2020/11/17 14:53]
 */
public class BatterCakeWithEgg extends BatterCake {

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
