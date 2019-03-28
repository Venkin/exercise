package com.venky.vip.day4.strategy.pay.payport;

/**
 * @author Venkin
 * @date 2019/3/28
 **/
public class PayState {

    private int code;
    private String state;
    private String reason;

    public PayState(int code, String state, String reason) {
        this.code = code;
        this.state = state;
        this.reason = reason;
    }

    public PayState(int code, String state) {
        this.code = code;
        this.state = state;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return ("支付状态：[" + code + "]," + state + ",交易详情：" + reason);
    }
}
