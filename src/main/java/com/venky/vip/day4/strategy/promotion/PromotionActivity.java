package com.venky.vip.day4.strategy.promotion;

/**
 * 促销活动方案
 *
 * @author Venkin
 * @date 2019/3/28
 **/
public class PromotionActivity {

    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void execute() {
        this.promotionStrategy.doPromotion();
    }
}
