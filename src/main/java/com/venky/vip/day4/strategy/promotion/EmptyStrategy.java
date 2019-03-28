package com.venky.vip.day4.strategy.promotion;

/**
 * 无优惠
 *
 * @author Venkin
 * @date 2019/3/28
 **/
public class EmptyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无优惠");
    }
}
