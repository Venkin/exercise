package com.venky.vip.day4.strategy.rebuild.model;

/**
 * 结果类
 *
 * @author huwk
 * @date 2018/12/5
 */
public class SynModel {

    /**
     * 操作方法
     */
    private String action;

    /**
     * 返回对象
     */
    private Object result;

    public SynModel(){}

    public SynModel(String action, Object result) {
        this.action = action;
        this.result = result;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "SynModel{" +
                "action='" + action + '\'' +
                ", result=" + result +
                '}';
    }
}
