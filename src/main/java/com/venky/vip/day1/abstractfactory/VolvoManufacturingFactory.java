package com.venky.vip.day1.abstractfactory;

import com.venky.vip.day1.ICar;
import com.venky.vip.day1.VolvoCar;

public class VolvoManufacturingFactory implements IManufacturingFactory {

    @Override
    public IMotor createMotor() {
        return new VolvoMotor();
    }

    @Override
    public ICar createCar() {
        return new VolvoCar();
    }
}
