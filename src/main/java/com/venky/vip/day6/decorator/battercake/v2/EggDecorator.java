package com.venky.vip.day6.decorator.battercake.v2;

/**
 * 鸡蛋装饰器
 *
 * @author Venkin
 * @date 2019/4/4
 **/
public class EggDecorator extends BattercakeDecorator {


    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "+1个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }
}
