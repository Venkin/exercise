package com.venky.vip.day1.simplefactory;

import com.venky.vip.day1.BMWCar;
import com.venky.vip.day1.ICar;
import com.venky.vip.day1.VolvoCar;

public class CarFactory {

    /**
     * 工厂创建实例方法
     *
     * @return
     */
    public static ICar create(String name) {
        switch (name) {
            case "BMW":
                return new BMWCar();
            case "VOLVO":
                return new VolvoCar();
            default:
                return null;
        }
    }

    /**
     * 工厂创建实例方法
     * 通过反射实现
     *
     * @return
     */
    public static ICar createByClassName(String className) {

        try {
            if (className != null && !"".equals(className)) {
                ICar car = (ICar) Class.forName(className).newInstance();
                return car;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * 工厂创建实例方法
     * 通过传class方式
     *
     * @return
     */
    public static ICar createByClass(Class<? extends ICar> clazz) {

        if (clazz != null) {
            try {
                return clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;

    }

}
