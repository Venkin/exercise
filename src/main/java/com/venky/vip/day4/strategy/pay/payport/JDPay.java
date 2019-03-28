package com.venky.vip.day4.strategy.pay.payport;

/**
 * 京东支付
 *
 * @author Venkin
 * @date 2019/3/28
 **/
public class JDPay extends Payment {
    @Override
    public String getName() {
        return "京东支付";
    }

    @Override
    protected double queryBalance(String id) {
        return 500;
    }
}
