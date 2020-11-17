package com.niu.design.pattern.structural.facade;

/**
 * 门面模式
 * 积分礼物
 *
 * @version 1.0 [2020/11/17 14:14]
 * @author [nza]
 * @createTime [2020/11/17 14:14]
 */
public class PointsGift {

    private String name;

    public PointsGift(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
