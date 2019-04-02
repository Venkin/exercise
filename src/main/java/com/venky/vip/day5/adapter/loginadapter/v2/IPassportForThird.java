package com.venky.vip.day5.adapter.loginadapter.v2;

import com.venky.vip.day5.adapter.loginadapter.ResultMsg;

/**
 * 第三方登录接口
 *
 * @author Venkin
 * @date 2019/4/2
 **/
public interface IPassportForThird {

    /**
     * QQ登录
     *
     * @param id
     * @return
     */
    ResultMsg loginForQQ(String id);

    /**
     * 微信登录
     *
     * @param token
     * @return
     */
    ResultMsg loginForWechat(String token);

    /**
     * token登录
     *
     * @return
     */
    ResultMsg loginForTelphone(String telphone,String code);

    /**
     * token登录
     *
     * @param id
     * @return
     */
    ResultMsg loginForToken(String id);


    /**
     * 注册后自动登录
     *
     * @param username
     * @param passport
     * @return
     */
    ResultMsg loginForRegister(String username,String passport);


}
