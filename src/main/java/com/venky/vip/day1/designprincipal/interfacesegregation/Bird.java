package com.venky.vip.day1.designprincipal.interfacesegregation;

/**
 * 鸟
 *
 * @author huwk
 * @date 2020/2/1
 **/
public class Bird implements EatAnimal,FlyAnimal {

    @Override
    public void eat() {
        System.out.println("觅食");
    }
    @Override
    public void fly() {
        System.out.println("飞翔");
    }
}
