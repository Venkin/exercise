package com.venky.vip.day1.abstractfactory;

public class AbstractFactory {

    public static void main(String[] args) {

        IManufacturingFactory bmwFactory = new BmwManufacturingFactory();
        bmwFactory.createCar().run();
        bmwFactory.createMotor().bike();

        IManufacturingFactory volvoFactory = new VolvoManufacturingFactory();
        volvoFactory.createMotor().bike();
        volvoFactory.createCar().run();
    }
}
