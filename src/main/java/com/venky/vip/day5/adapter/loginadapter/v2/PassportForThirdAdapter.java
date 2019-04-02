package com.venky.vip.day5.adapter.loginadapter.v2;

import com.venky.vip.day5.adapter.loginadapter.ResultMsg;
import com.venky.vip.day5.adapter.loginadapter.v1.SigninService;

/**
 * 第三方登录适配器
 *
 * @author Venkin
 * @date 2019/4/2
 **/
public class PassportForThirdAdapter extends SigninService implements IPassportForThird {

    @Override
    public ResultMsg loginForQQ(String id) {
        return processLogin(id,LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForWechat(String token) {
        return processLogin(token,LoginForWechatAdapter.class);
    }

    @Override
    public ResultMsg loginForTelphone(String telphone, String code) {
        return processLogin(telphone,LoginForTelAdapter.class);
    }

    @Override
    public ResultMsg loginForToken(String id) {
        return processLogin(id,LoginForTokenAdapter.class);
    }

    @Override
    public ResultMsg loginForRegister(String username, String password) {
        super.register(username,password);
        return super.login(username,password);
    }

    /**
     * 登录逻辑
     * 用到了工厂模式和策略模式
     *
     * @param key
     * @param clazz
     * @return
     */
    private ResultMsg processLogin(String key,Class<? extends LoginAdapter> clazz ) {
        try {
            LoginAdapter adapter = clazz.newInstance();

            // 判断传过过来的逻辑的是否能处理指定逻辑
            if (adapter.support(adapter)) {
                return adapter.login(key,adapter);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
