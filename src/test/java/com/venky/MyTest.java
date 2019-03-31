package com.venky;

import com.venky.vip.day4.strategy.rebuild.ConfigurationPushStrategy;
import com.venky.vip.day4.strategy.rebuild.model.NumberWhite;
import com.venky.vip.day4.strategy.rebuild.model.SynModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 测试类
 *
 * @author Venkin
 * @date 2019/3/29
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
@ComponentScan
public class MyTest {

    public static void main(String[] args) {


    }

    @Test
    public void test() {
        NumberWhite numberWhite = new NumberWhite();

        SynModel synModel = new SynModel("Create_NumberWhite",numberWhite);


        ConfigurationPushStrategy.getConfigurationPush(synModel).operate(synModel);
    }

}
