package com.venky.vip.day1.factorymethod;

import com.venky.vip.day1.ICar;

public interface ICarFactory {

    /**
     * 汽车工厂创建方法
     *
     * @return
     */
    ICar create();
}
