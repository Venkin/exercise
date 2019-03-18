package com.venky.vip.day3.prototype.deep;

import java.io.Serializable;

/**
 * 金箍棒实体
 *
 * @author Venkin
 * @date 2019/3/17
 **/
public class GoldenMagicStick implements Serializable {

    float h = 100;
    float d = 10;

    /**
     * 半大方法
     */
    public void big() {
        this.d *= 2;
        this.h *= 2;
    }

    /**
     * 变小方法
     */
    public void small() {
        this.d /= 2;
        this.h /= 2;
    }

    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }

    public float getD() {
        return d;
    }

    public void setD(float d) {
        this.d = d;
    }
}
