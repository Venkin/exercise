package com.venky.vip.day5.adapter.loginadapter.v2;

import com.venky.vip.day5.adapter.loginadapter.ResultMsg;

/**
 * QQ登录适配器
 *
 * @author Venkin
 * @date 2019/4/2
 **/
public class LoginForQQAdapter implements LoginAdapter {

    @Override
    public boolean support(Object object) {
        return object instanceof LoginForQQAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }



}
