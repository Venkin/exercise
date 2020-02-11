package com.venky.vip.day1.designprincipal.liskovsubsititution;

/**
 * @author huwk
 * @date 2020/1/13
 **/
public class BrownKiwi extends Bird {

    @Override
    public void setFlySpeed(Double flySpeed) {
        super.setFlySpeed(0d);
    }
}
