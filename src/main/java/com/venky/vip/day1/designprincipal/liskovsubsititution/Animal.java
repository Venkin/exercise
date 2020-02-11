package com.venky.vip.day1.designprincipal.liskovsubsititution;

/**
 * @author huwk
 * @date 2020/1/13
 **/
public class Animal {

    Double runSpeed;

    public void setRunSpeed(Double runSpeed) {
        this.runSpeed = runSpeed;
    }

    public Double getRunTime(Double distance) {
        return distance / runSpeed;
    }
}
