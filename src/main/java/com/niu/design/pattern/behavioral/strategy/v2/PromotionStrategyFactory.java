package com.niu.design.pattern.behavioral.strategy.v2;

import com.google.common.collect.Maps;
import com.niu.design.pattern.behavioral.strategy.v1.DirectPromotionStrategy;
import com.niu.design.pattern.behavioral.strategy.v1.FullReductionPromotionStrategy;
import com.niu.design.pattern.behavioral.strategy.v1.PromotionStrategy;
import com.niu.design.pattern.behavioral.strategy.v1.ReturnCashPromotionStrategy;

import java.util.Map;

/**
 * 策略模式
 * <p>
 * 促销策略工厂
 *
 * @author [nza]
 * @version 1.0 [2021/01/07 11:39]
 * @createTime [2021/01/07 11:39]
 */
public class PromotionStrategyFactory {

    /**
     * 策略 map
     */
    private static Map<PromotionStrategyEnum, PromotionStrategy> PROMOTION_STRATEGY_MAP;

    /**
     * 无促销
     */
    private static final PromotionStrategy EMPTY_STRATEGY;

    static {
        PROMOTION_STRATEGY_MAP = Maps.newHashMap();
        PROMOTION_STRATEGY_MAP.put(PromotionStrategyEnum.DIRECT, new DirectPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionStrategyEnum.FULL_REDUCTION, new FullReductionPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionStrategyEnum.RETURN_CASH, new ReturnCashPromotionStrategy());

        EMPTY_STRATEGY = new EmptyPromotionStrategy();
    }

    private PromotionStrategyFactory() {
    }


    /**
     * 获取策略
     *
     * @param strategyEnum 策略枚举
     * @return {@link PromotionStrategy}
     */
    public static PromotionStrategy getStrategy(PromotionStrategyEnum strategyEnum) {

        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(strategyEnum);

        return promotionStrategy == null ? EMPTY_STRATEGY : promotionStrategy;
    }
}
