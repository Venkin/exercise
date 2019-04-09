package com.venky.vip.day6.decorator.battercake.v2;

/**
 * 煎饼测试类
 *
 * @author Venkin
 * @date 2019/4/4
 **/
public class BattercateTest {

    public static void main(String[] args) {

        Battercake battercake;

        // 路边摊买了一个煎饼
        battercake = new BaseBattercake();

        // 煎饼有点小，想再加一个鸡蛋
        battercake = new EggDecorator(battercake);

        // 还是不够吃，再加个鸡蛋
        battercake = new EggDecorator(battercake);

        // 还是吃不饱，再加一个香肠
        battercake = new SausageDecorator(battercake);

        // 跟静态代理的区别是职责不同
        // 静态代理不一定要满足is-a的关系
        // 静态代理会做功能的增强，同一个职责变得不一样

        // 装饰器更多的是考虑扩展

        System.out.println(battercake.getMsg() + ",总价：" + battercake.getPrice());


    }
}
