package com.niu.design.pattern.behavioral.strategy.v1;

/**
 * 策略模式
 * <p>
 * 促销策略
 *
 * @author [nza]
 * @version 1.0 [2021/01/07 11:24]
 * @createTime [2021/01/07 11:24]
 */
public interface PromotionStrategy {

    /**
     * 进行促销
     */
    void doPromotion();
}
