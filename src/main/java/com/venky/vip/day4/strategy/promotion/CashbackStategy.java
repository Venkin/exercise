package com.venky.vip.day4.strategy.promotion;

/**
 * 返现抵扣策略
 *
 * @author Venkin
 * @date 2019/3/28
 **/
public class CashbackStategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现促销，买送现金");
    }
}
