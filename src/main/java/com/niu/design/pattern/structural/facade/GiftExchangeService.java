package com.niu.design.pattern.structural.facade;

/**
 * 门面模式
 * 礼物兑换业务类
 *
 * @author [nza]
 * @version 1.0 [2020/11/17 14:20]
 * @createTime [2020/11/17 14:20]
 */
public class GiftExchangeService {

    private PointsPaymentService paymentService;

    private QualifyService qualifyService;

    private ShippingService shippingService;

    public GiftExchangeService(PointsPaymentService paymentService, QualifyService qualifyService, ShippingService shippingService) {
        this.paymentService = paymentService;
        this.qualifyService = qualifyService;
        this.shippingService = shippingService;
    }

    /**
     * 兑换礼物
     *
     * @param gift 礼物
     * @author nza
     * @createTime 2020/11/17 14:23
     */
    public void giftExchange(PointsGift gift) {
        if (qualifyService.isAvailable(gift)) {
            // 资格校验符合
            if (paymentService.pay(gift)) {
                // 支付成功
                String shippingNum = shippingService.shipGift(gift);
                System.out.println("物流下单成功, 订单号: " + shippingNum);
            }
        }
    }
}
