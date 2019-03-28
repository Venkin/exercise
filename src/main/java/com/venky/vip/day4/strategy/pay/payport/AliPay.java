package com.venky.vip.day4.strategy.pay.payport;

/**
 * 支付宝
 *
 * @author Venkin
 * @date 2019/3/28
 **/
public class AliPay extends Payment {
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    protected double queryBalance(String id) {
        return 900;
    }
}
