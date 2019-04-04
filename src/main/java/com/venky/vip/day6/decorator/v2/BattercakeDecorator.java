package com.venky.vip.day6.decorator.v2;

/**
 * 煎饼装饰器
 *
 * @author Venkin
 * @date 2019/4/4
 **/
public abstract class BattercakeDecorator extends Battercake {

    private Battercake battercake;

    public BattercakeDecorator(Battercake battercake) {
        this.battercake = battercake;
    }

    protected abstract void doSomething();

    @Override
    protected String getMsg() {
        return this.battercake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.battercake.getPrice();
    }
}
