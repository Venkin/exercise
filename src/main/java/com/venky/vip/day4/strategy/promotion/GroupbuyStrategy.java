package com.venky.vip.day4.strategy.promotion;

/**
 * 团购活动策略
 *
 * @author Venkin
 * @date 2019/3/28
 **/
public class GroupbuyStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("团购享受优惠");
    }
}
