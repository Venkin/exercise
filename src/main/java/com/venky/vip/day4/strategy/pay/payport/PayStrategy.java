package com.venky.vip.day4.strategy.pay.payport;

import java.util.HashMap;
import java.util.Map;

/**
 * 支付策略管理
 * 使用单例和工厂模式实现
 *
 * @author Venkin
 * @date 2019/3/28
 **/
public class PayStrategy {

    public static final String ALI_PAY = "AliPay";
    public static final String JD_PAY = "JdPay";
    public static final String WECHAT_PAY = "WechatPay";
    public static final String UNION_PAY = "UnionPay";
    public static final String DEFAULT_PAY = ALI_PAY;

    private static Map<String,Payment> payStrategy = new HashMap<>();

    private PayStrategy(){}

    static {
        payStrategy.put(ALI_PAY,new AliPay());
        payStrategy.put(JD_PAY,new JDPay());
        payStrategy.put(WECHAT_PAY,new WechatPay());
        payStrategy.put(UNION_PAY,new UnionPay());
    }

    public static Payment get(String payKey) {

        if (!payStrategy.containsKey(payKey)) {
            return payStrategy.get(DEFAULT_PAY);
        }
        return payStrategy.get(payKey);
    }




}
