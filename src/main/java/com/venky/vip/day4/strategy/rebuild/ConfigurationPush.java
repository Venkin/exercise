package com.venky.vip.day4.strategy.rebuild;


import com.venky.vip.day4.strategy.rebuild.model.SynModel;

/**
 * 配置推送公共方法
 *
 * @author Venkin
 * @date 2019/3/31
 **/
public interface ConfigurationPush<T> {

    void operate(SynModel synModel);
}
