package com.venky.vip.day1.factorymethod;

import com.venky.vip.day1.ICar;
import com.venky.vip.day1.VolvoCar;

public class VolvoCarFactory implements ICarFactory {

    @Override
    public ICar create() {
        return new VolvoCar();
    }
}
