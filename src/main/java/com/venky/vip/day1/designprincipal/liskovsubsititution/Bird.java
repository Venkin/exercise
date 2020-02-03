package com.venky.vip.day1.designprincipal.liskovsubsititution;

/**
 * @author huwk
 * @date 2020/1/13
 **/
public class Bird extends Animal {

    Double flySpeed;

    public void setFlySpeed(Double flySpeed) {
        this.flySpeed = flySpeed;
    }

    public Double getFlyTime(Double distance) {
        return distance / flySpeed;
    }

}
