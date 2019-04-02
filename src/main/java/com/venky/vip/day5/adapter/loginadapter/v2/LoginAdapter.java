package com.venky.vip.day5.adapter.loginadapter.v2;

import com.venky.vip.day5.adapter.loginadapter.ResultMsg;

/**
 * 登录适配器
 *
 * @author Venkin
 * @date 2019/4/2
 **/
public interface LoginAdapter {

    boolean support(Object object);

    ResultMsg login(String id,Object adapter);
}
