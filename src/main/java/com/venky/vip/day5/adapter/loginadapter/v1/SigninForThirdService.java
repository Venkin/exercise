package com.venky.vip.day5.adapter.loginadapter.v1;

import com.venky.vip.day5.adapter.loginadapter.ResultMsg;

/**
 * 第三方登录
 * 之前问的运行的方法不去动，继承下来
 *
 * @author Venkin
 * @date 2019/4/2
 **/
public class SigninForThirdService extends SigninService {

    /**
     * QQ登录
     *
     * @param openId
     * @return
     */
    public ResultMsg loginForQQ(String openId){
        // 1、openId是全局唯一，可以当成一个用户名
        // 2、密码默认为QQ_EMPTY
        // 3、注册，在原有系统里面创建一个用户
        // 4、调用原来的登录方法
        return loginForRegister(openId,null);
    }

    private ResultMsg loginForRegister(String username, String password) {
        super.register(username,password);
        return super.login(username,password);
    }

    public ResultMsg loginForWechat(String openId){
        return null;
    }

    public ResultMsg loginForToken(String openId){
        // 通过token 拿到用户信息，然后重新登录
        return null;
    }

    public ResultMsg loginForTelphone(String telphone,String code){
        return null;
    }

}
