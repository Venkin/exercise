package com.venky.vip.day4.strategy.pay.payport;

/**
 * 支付渠道
 *
 * @author Venkin
 * @date 2019/3/28
 **/
public abstract class Payment {

    /**
     * 支付类型
     *
     * @return
     */
    public abstract String getName();

    /**
     * 查询余额
     *
     * @param id
     * @return
     */
    protected abstract double queryBalance(String id);

    /**
     * 扣款支付
     *
     * @param uid
     * @param amount
     * @return
     */
    public PayState pay(String uid,double amount) {
        if (queryBalance(uid) < amount) {
            return new PayState(500,"支付失败","余额不足");
        }
        return new PayState(200,"支付成功","支付金额" + amount);

    }
}
