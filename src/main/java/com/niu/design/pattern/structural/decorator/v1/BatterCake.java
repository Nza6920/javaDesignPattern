package com.niu.design.pattern.structural.decorator.v1;

/**
 * 煎饼
 *
 * @version 1.0 [2020/11/17 14:52]
 * @author [nza]
 * @createTime [2020/11/17 14:52]
 */
public class BatterCake {

    protected String getDesc() {
        return "煎饼";
    }

    protected int cost() {
        return 8;
    }
}
