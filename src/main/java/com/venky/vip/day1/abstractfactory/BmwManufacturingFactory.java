package com.venky.vip.day1.abstractfactory;

import com.venky.vip.day1.BMWCar;
import com.venky.vip.day1.ICar;

public class BmwManufacturingFactory implements IManufacturingFactory {

    @Override
    public IMotor createMotor() {
        return new BmwMotor();
    }

    @Override
    public ICar createCar() {
        return new BMWCar();
    }
}
