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
        return null;
    }

    @Override
    public ResultMsg loginForWechat(String token) {
        return null;
    }

    @Override
    public ResultMsg loginForTelphone(String telphone, String code) {
        return null;
    }

    @Override
    public ResultMsg loginForToken(String id) {
        return null;
    }

    @Override
    public ResultMsg loginForRegister(String username, String passport) {
        return null;
    }

    private ResultMsg processLogin(String key,Class<? extends LoginAdapter> clazz ) {
        try {
            LoginAdapter adapter = clazz.newInstance();
            if (adapter.support(adapter)) {
                return adapter.login(key,adapter);
            } else {
                return null;
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
