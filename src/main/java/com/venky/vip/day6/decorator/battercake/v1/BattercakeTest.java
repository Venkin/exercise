package com.venky.vip.day6.decorator.battercake.v1;

/**
 * 煎饼测试类
 *
 * @author Venkin
 * @date 2019/4/4
 **/
public class BattercakeTest {

    public static void main(String[] args) {

        Battercake battercake = new Battercake();
        System.out.println(battercake.getMsg() + "总价格：" + battercake.getPrice());

        Battercake battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getMsg() + "总价格：" + battercakeWithEgg.getPrice());

        BattercakeWithSausage battercakeWithSausage = new BattercakeWithSausage();
        System.out.println(battercakeWithSausage.getMsg() + "总价格：" + battercakeWithSausage.getPrice());


    }
}
