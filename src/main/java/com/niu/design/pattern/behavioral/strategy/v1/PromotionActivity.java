package com.niu.design.pattern.behavioral.strategy.v1;

/**
 * 策略模式
 * <p>
 * 促销活动
 *
 * @author [nza]
 * @version 1.0 [2021/01/07 11:30]
 * @createTime [2021/01/07 11:30]
 */
public class PromotionActivity {

    /**
     * 促销策略
     */
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotionStrategy() {
        promotionStrategy.doPromotion();
    }
}
