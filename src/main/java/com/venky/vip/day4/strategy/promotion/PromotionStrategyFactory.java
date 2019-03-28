package com.venky.vip.day4.strategy.promotion;

import java.util.HashMap;
import java.util.Map;

/**
 * 促销活动工厂类
 *
 * @author Venkin
 * @date 2019/3/28
 **/
public class PromotionStrategyFactory {

    private static Map<String,PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();

    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.COUPON.name(),new CoupanStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.CASHBACK.name(),new CashbackStategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.GROUPBUY.name(),new GroupbuyStrategy());
    }

    private static final PromotionStrategy NON_PROMOTION = new EmptyStrategy();

    private PromotionStrategyFactory(){}

    public static PromotionStrategy getPromotionStrategy(String promotionKey) {
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        return promotionStrategy == null ? NON_PROMOTION : promotionStrategy;
    }



    private enum  PromotionKey {
        COUPON,
        CASHBACK,
        GROUPBUY;
    }

}
