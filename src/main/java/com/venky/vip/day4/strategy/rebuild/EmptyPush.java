package com.venky.vip.day4.strategy.rebuild;

import com.venky.vip.day4.strategy.rebuild.model.SynModel;

/**
 * 空推送
 *
 * @author Venkin
 * @date 2019/3/31
 **/
public class EmptyPush implements ConfigurationPush {

    @Override
    public void operate(SynModel synModel) {

        System.out.println("这个是空方法，什么都么有");
    }
}
