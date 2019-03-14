package com.venky.vip.day1.factorymethod;

import com.venky.vip.day1.ICar;

public class FactoryMethodTest {

    public static void main(String[] args) {

        ICarFactory carBmwFactory = new BMWCarFactory();
        ICar bmw = carBmwFactory.create();
        bmw.run();

        ICarFactory carVolvoFactory = new VolvoCarFactory();
        ICar volvo = carVolvoFactory.create();
        volvo.run();


    }
}
