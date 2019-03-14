package com.venky.vip.day1.simplefactory;

import com.venky.vip.day1.BMWCar;
import com.venky.vip.day1.ICar;

public class SimpleFactoryTest {

    public static void main(String[] args) {

        ICar bmw = CarFactory.create("BMW");
        bmw.run();

        ICar volvo = CarFactory.create("VOLVO");
        volvo.run();

        ICar bmw1 = CarFactory.createByClassName("com.venky.vip.day1.BMWCar");
        bmw1.run();
        ICar volvo1 = CarFactory.createByClassName("com.venky.vip.day1.VolvoCar");
        volvo1.run();


        ICar bmw2 = CarFactory.createByClass(BMWCar.class);
        bmw2.run();

    }
}
