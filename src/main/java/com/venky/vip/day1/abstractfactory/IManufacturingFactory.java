package com.venky.vip.day1.abstractfactory;

import com.venky.vip.day1.ICar;

/**
 * 机械制造厂的工厂
 */
public interface IManufacturingFactory {

    /**
     * 生产摩托
     *
     * @return
     */
    IMotor createMotor();

    /**
     * 生产汽车
     *
     * @return
     */
    ICar createCar();
}