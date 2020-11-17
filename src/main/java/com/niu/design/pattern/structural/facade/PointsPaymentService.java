package com.niu.design.pattern.structural.facade;

/**
 * 门面模式
 * 积分购买业务类
 *
 * @version 1.0 [2020/11/17 14:17]
 * @author [nza]
 * @createTime [2020/11/17 14:17]
 */
public class PointsPaymentService {

    public boolean pay(PointsGift gift) {
        // 扣减积分
        System.out.println("支付" + gift.getName());
        return true;
    }
}
