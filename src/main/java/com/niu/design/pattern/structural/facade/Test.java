package com.niu.design.pattern.structural.facade;

/**
 * 门面模式
 * 测试类
 *
 * @author [nza]
 * @version 1.0 [2020/11/17 14:24]
 * @createTime [2020/11/17 14:24]
 */
public class Test {

    public static void main(String[] args) {
        PointsGift gift = new PointsGift("大疆无人机");

        QualifyService qualifyService = new QualifyService();
        PointsPaymentService pointsPaymentService = new PointsPaymentService();
        ShippingService shippingService = new ShippingService();

        GiftExchangeService giftExchangeService = new GiftExchangeService(pointsPaymentService,
                qualifyService,
                shippingService);
        giftExchangeService.giftExchange(gift);
    }
}
