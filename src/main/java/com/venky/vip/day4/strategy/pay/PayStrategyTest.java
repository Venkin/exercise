package com.venky.vip.day4.strategy.pay;

import com.venky.vip.day4.strategy.pay.payport.PayStrategy;

/**
 * 支付策略测试
 *
 * @author Venkin
 * @date 2019/3/28
 **/
public class PayStrategyTest {

    public static void main(String[] args) {

        // 直接开始点单，准备支付
        Order order = new Order("1","201900100001001001",264.5);

        // 开始支付，可以选择多种支付方式
        // 每个渠道的支付具体算法不一致

        // 支付的时候用户可以选择用哪个支付方式
        System.out.println(order.pay(PayStrategy.UNION_PAY));
    }
}
