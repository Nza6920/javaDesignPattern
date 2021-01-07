package com.niu.design.pattern.behavioral.strategy.v1;

/**
 * 策略模式
 * <p>
 * 满减促销策略
 *
 * @author [nza]
 * @version 1.0 [2021/01/07 11:25]
 * @createTime [2021/01/07 11:25]
 */
public class FullReductionPromotionStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("满减促销");
    }
}
