package com.venky.vip.day5.adapter.loginadapter.v1;

import com.venky.vip.day5.adapter.loginadapter.Member;
import com.venky.vip.day5.adapter.loginadapter.ResultMsg;

/**
 * 登录服务层
 *
 * @author Venkin
 * @date 2019/4/2
 **/
public class SigninService {

    /**
     * 注册方法
     *
     * @param username
     * @param password
     * @return
     */
    public ResultMsg register(String username,String password){
        return new ResultMsg(200,"注册成功",new Member());
    }

    /**
     * 登录方法
     *
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username,String password) {
        return null;
    }




}
