package com.venky.vip.day1.designprincipal.interfacesegregation;

/**
 * 狗
 *
 * @author huwk
 * @date 2020/2/1
 **/
public class Dog implements EatAnimal,SwimAnimal {
    @Override
    public void eat() {
        System.out.println("觅食");
    }

    @Override
    public void swim() {
        System.out.println("游泳");
    }
}
