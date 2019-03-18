package com.venky.vip.day3.prototype.shadow;

import java.util.ArrayList;
import java.util.List;

/**
 * 原型模式测试类
 *
 * @author Venkin
 * @date 2019/3/17
 **/
public class PrototypeTest {

    public static void main(String[] args) {

        //创建一个具体需要被克隆的对象
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        concretePrototypeA.setAge(18);
        concretePrototypeA.setName("Venkin");

        List<String> hobbies = new ArrayList<>();
        concretePrototypeA.setHobbies(hobbies);
        System.out.println(concretePrototypeA.getHobbies());

        // 创建Client对象，准备开始克隆
        Client client = new Client();
        ConcretePrototypeA concretePrototypeClone = (ConcretePrototypeA) client.startClone(concretePrototypeA);

        System.out.println(concretePrototypeClone.getHobbies());

        System.out.println(concretePrototypeA.getHobbies() == concretePrototypeClone.getHobbies());

    }
}
