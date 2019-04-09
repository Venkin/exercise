package com.venky.vip.day6.decorator.battercake.v1;

/**
 * 煎饼加鸡蛋和香肠
 *
 * @author Venkin
 * @date 2019/4/4
 **/
public class BattercakeWithSausage extends BattercakeWithEgg {

    @Override
    protected String getMsg() {
        return super.getMsg() + "+1 香肠";
    }

    /**
     * 将香肠两块钱
     *
     * @return
     */
    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }


}
