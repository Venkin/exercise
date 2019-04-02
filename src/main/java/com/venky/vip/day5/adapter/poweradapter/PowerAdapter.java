package com.venky.vip.day5.adapter.poweradapter;

/**
 * 电压适配器
 *
 * @author Venkin
 * @date 2019/4/2
 **/
public class PowerAdapter extends DC5 {

    private AC220 ac220;
    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    public int outputDC5V(){
        int adapterInput = ac220.outputAC220V();

        int adapterOutput = adapterInput / 44;

        System.out.println("适配器输入AC " + adapterInput + "V" + "输出DC "+ adapterOutput + "V");
        return adapterOutput;
    }
}
