package com.venky.vip.day4.strategy.pay.payport;

/**
 * 微信支付
 *
 * @author Venkin
 * @date 2019/3/28
 **/
public class WechatPay extends Payment {
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    protected double queryBalance(String id) {
        return 256;
    }

}
