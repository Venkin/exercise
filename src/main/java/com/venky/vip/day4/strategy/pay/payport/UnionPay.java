package com.venky.vip.day4.strategy.pay.payport;

/**
 * 银联支付
 *
 * @author Venkin
 * @date 2019/3/28
 **/
public class UnionPay extends Payment {
    @Override
    public String getName() {
        return "银联支付";
    }

    @Override
    protected double queryBalance(String id) {
        return 120;
    }
}
