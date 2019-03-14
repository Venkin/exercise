package com.venky.vip.day1.factorymethod;

import com.venky.vip.day1.BMWCar;
import com.venky.vip.day1.ICar;

public class BMWCarFactory implements ICarFactory {

    @Override
    public ICar create() {
        return new BMWCar();
    }
}
