package com.venky.vip.day6.decorator.battercake.v2;

/**
 * 香肠装饰器
 *
 * @author Venkin
 * @date 2019/4/4
 **/
public class SausageDecorator extends BattercakeDecorator {

    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "+1香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
