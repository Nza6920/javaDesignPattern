package com.niu.design.pattern.structural.facade;

/**
 * 门面模式
 * 物流业务类
 *
 * @author [nza]
 * @version 1.0 [2020/11/17 14:18]
 * @createTime [2020/11/17 14:18]
 */
public class ShippingService {

    public String shipGift(PointsGift gift) {
        System.out.println(gift.getName() + "进入物流系统");
        String shippingOrderNumber = "666";
        return shippingOrderNumber;
    }
}
