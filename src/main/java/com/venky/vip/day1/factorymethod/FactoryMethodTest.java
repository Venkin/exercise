package com.venky.vip.day1.factorymethod;

public class FactoryMethodTest {

    public static void main(String[] args) {

        ICarFactory carBmwFactory = new BMWCarFactory();
        carBmwFactory.create().run();

        /*ICarFactory carVolvoFactory = new VolvoCarFactory();
        ICar volvo = carVolvoFactory.create();
        volvo.run();*/


    }
}
