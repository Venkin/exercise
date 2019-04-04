package com.venky.vip.day6.decorator.v2;

/**
 * 基础套餐
 *
 * @author Venkin
 * @date 2019/4/4
 **/
public class BaseBattercake extends Battercake {


    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
