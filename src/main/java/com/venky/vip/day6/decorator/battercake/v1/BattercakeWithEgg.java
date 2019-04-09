package com.venky.vip.day6.decorator.battercake.v1;

/**
 * 加了鸡蛋的煎饼
 *
 * @author Venkin
 * @date 2019/4/3
 **/
public class BattercakeWithEgg extends Battercake {

    @Override
    protected String getMsg() {
        return super.getMsg() + "+1 个鸡蛋";
    }

    // 加了一个鸡蛋加1块钱
    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }




}
