package com.niu.design.pattern.behavioral.strategy;

import com.niu.design.pattern.behavioral.strategy.v1.*;
import com.niu.design.pattern.behavioral.strategy.v2.PromotionStrategyEnum;
import com.niu.design.pattern.behavioral.strategy.v2.PromotionStrategyFactory;

/**
 * 策略模式
 *
 * @author [nza]
 * @version 1.0 [2021/01/07 11:33]
 * @createTime [2021/01/07 11:33]
 */
public class Test {

    public static void main(String[] args) {

        strategyV1();

//        strategyV2();
    }

    private static void strategyV2() {
        PromotionStrategy promotionStrategy = PromotionStrategyFactory.getStrategy(PromotionStrategyEnum.RETURN_CASH);
        PromotionActivity activity = new PromotionActivity(promotionStrategy);
        activity.executePromotionStrategy();
    }

    private static void strategyV1() {
        PromotionActivity activity618 = new PromotionActivity(new DirectPromotionStrategy());
        PromotionActivity activity1111 = new PromotionActivity(new ReturnCashPromotionStrategy());
        PromotionActivity activity1212 = new PromotionActivity(new FullReductionPromotionStrategy());
        while (true) {
            activity618.executePromotionStrategy();
            activity1111.executePromotionStrategy();
            activity1212.executePromotionStrategy();
        }
    }
}
