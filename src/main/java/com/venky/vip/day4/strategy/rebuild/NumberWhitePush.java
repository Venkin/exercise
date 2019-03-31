package com.venky.vip.day4.strategy.rebuild;

import com.venky.vip.day4.strategy.rebuild.model.NumberWhite;
import com.venky.vip.day4.strategy.rebuild.model.SynModel;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * 号码白名单
 *
 * @author Venkin
 * @date 2019/3/31
 **/
@Component
public class NumberWhitePush implements ConfigurationPush,InitializingBean {


    public void insert(NumberWhite numberWhite) {

        System.out.println("插入操作" + numberWhite);

    }

    public void update(NumberWhite numberWhite) {

        System.out.println("更新操作" + numberWhite);
    }

    public void delete(NumberWhite numberWhite) {

        System.out.println("删除操作" + numberWhite);
    }

    @Override
    public void operate(SynModel synModel) {
        String action = synModel.getAction();
        NumberWhite numberWhite = (NumberWhite) synModel.getResult();
        if (action.contains("Create")) {
            insert(numberWhite);
        } else if (action.contains("Update")) {
            update(numberWhite);
        } else if (action.contains("Delete")) {
            delete(numberWhite);
        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        ConfigurationPushStrategy.registerConfigurationPush("NumberWhite",this);
        System.out.println("初始化NumberWhite");
    }
}
