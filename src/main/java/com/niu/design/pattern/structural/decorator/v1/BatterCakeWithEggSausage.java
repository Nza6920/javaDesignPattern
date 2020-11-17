package com.niu.design.pattern.structural.decorator.v1;

/**
 * 煎蛋 + 香肠
 *
 * @version 1.0 [2020/11/17 14:55]
 * @author [nza]
 * @createTime [2020/11/17 14:55]
 */
public class BatterCakeWithEggSausage extends BatterCakeWithEgg {

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
