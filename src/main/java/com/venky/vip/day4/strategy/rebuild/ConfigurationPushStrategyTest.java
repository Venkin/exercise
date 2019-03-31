package com.venky.vip.day4.strategy.rebuild;

import com.venky.vip.day4.strategy.rebuild.model.NumberWhite;
import com.venky.vip.day4.strategy.rebuild.model.SynModel;

/**
 * 配置推送策略测试
 *
 * @author Venkin
 * @date 2019/3/31
 **/
public class ConfigurationPushStrategyTest {

    public static void main(String[] args) {


        NumberWhite numberWhite = new NumberWhite();

        SynModel synModel = new SynModel("Create_NumberWhite",numberWhite);


        ConfigurationPushStrategy.getConfigurationPush(synModel).operate(synModel);





    }
}
