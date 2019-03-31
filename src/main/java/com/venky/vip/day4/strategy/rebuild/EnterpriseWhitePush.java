package com.venky.vip.day4.strategy.rebuild;

import com.venky.vip.day4.strategy.rebuild.model.EnterpriseWhite;
import com.venky.vip.day4.strategy.rebuild.model.SynModel;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * 企业白名单
 *
 * @author Venkin
 * @date 2019/3/31
 **/
@Component
public class EnterpriseWhitePush implements ConfigurationPush,InitializingBean {



    public void insert(EnterpriseWhite enterpriseWhite) {

        System.out.println("insert" + enterpriseWhite);
    }

    public void update(EnterpriseWhite enterpriseWhite) {
        System.out.println("update" + enterpriseWhite);
    }

    public void delete(EnterpriseWhite enterpriseWhite) {
        System.out.println("delete" + enterpriseWhite);
    }

    @Override
    public void operate(SynModel synModel) {
        String action = synModel.getAction();
        EnterpriseWhite enterpriseWhite = (EnterpriseWhite) synModel.getResult();
        if (action.contains("Create")) {
            insert(enterpriseWhite);
        } else if (action.contains("Update")) {
            update(enterpriseWhite);
        } else if (action.contains("Delete")) {
            delete(enterpriseWhite);
        }

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        ConfigurationPushStrategy.registerConfigurationPush("EnterpriseWhite",this);
        System.out.println("初始化EnterpriseWhite");
    }
}
