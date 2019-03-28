package com.venky.vip.day4.strategy.promotion;

/**
 * 优惠券策略
 *
 * @author Venkin
 * @date 2019/3/28
 **/
public class CoupanStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("领取优惠券，减免抵扣");
    }
}
