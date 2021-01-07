package com.niu.design.pattern.behavioral.strategy.v1;

/**
 * 策略模式
 * <p>
 * 返现策略
 *
 * @author [nza]
 * @version 1.0 [2021/01/07 11:28]
 * @createTime [2021/01/07 11:28]
 */
public class ReturnCashPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现促销");
    }
}
