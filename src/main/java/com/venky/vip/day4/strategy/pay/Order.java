package com.venky.vip.day4.strategy.pay;

import com.venky.vip.day4.strategy.pay.payport.PayState;
import com.venky.vip.day4.strategy.pay.payport.PayStrategy;
import com.venky.vip.day4.strategy.pay.payport.Payment;

/**
 * 定单类
 *
 * @author Venkin
 * @date 2019/3/28
 **/
public class Order {

    private String uid;
    private String orderId;
    private double amount;

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    /**
     * 支付方法
     * 省去了非常多的if-else判断
     *
     * @return
     */
    public PayState pay(){
        return pay(PayStrategy.DEFAULT_PAY);
    }
    public PayState pay(String payKey){

        Payment payment = PayStrategy.get(payKey);
        System.out.println("欢迎使用" + payment.getName());
        System.out.println("本次交易金额为:" + amount +"，开始支付。。。");
        return payment.pay(uid,amount);
    }
}
