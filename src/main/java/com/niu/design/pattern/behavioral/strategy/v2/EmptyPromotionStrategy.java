package com.niu.design.pattern.behavioral.strategy.v2;

import com.niu.design.pattern.behavioral.strategy.v1.PromotionStrategy;

/**
 * 策略模式
 *
 * 无促销
 *
 * @version 1.0 [2021/01/07 11:45]
 * @author [nza]
 * @createTime [2021/01/07 11:45]
 */
public class EmptyPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
