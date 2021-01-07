package com.niu.design.pattern.behavioral.strategy.v1;

/**
 * 策略模式
 * <p>
 * 立减策略
 *
 * @author [nza]
 * @version 1.0 [2021/01/07 11:26]
 * @createTime [2021/01/07 11:26]
 */
public class DirectPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("立减促销");
    }
}
