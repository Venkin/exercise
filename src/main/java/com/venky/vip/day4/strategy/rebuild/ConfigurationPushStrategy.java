package com.venky.vip.day4.strategy.rebuild;

import com.venky.vip.day4.strategy.rebuild.model.SynModel;

import java.util.HashMap;
import java.util.Map;

/**
 * 消息服务推送策略类
 *
 * @author Venkin
 * @date 2019/3/31
 **/
public class ConfigurationPushStrategy {

    private static Map<String,ConfigurationPush> configurationPushMap = new HashMap<>();


    private ConfigurationPushStrategy(){}

    private static final ConfigurationPush EMPTY_PUSH = new EmptyPush();


    /**
     * 获取配置推送
     *
     * @param synModel
     * @return
     */
    public static ConfigurationPush getConfigurationPush(SynModel synModel) {

        String className = synModel.getAction().split("_")[1];

        ConfigurationPush result = configurationPushMap.get(className);

        return result == null ? EMPTY_PUSH : configurationPushMap.get(className);
    }

    /**
     * 注册配置推送
     *
     * @param action
     * @param push
     */
    public static void registerConfigurationPush(String action,ConfigurationPush push){
        configurationPushMap.put(action,push);
    }

}
