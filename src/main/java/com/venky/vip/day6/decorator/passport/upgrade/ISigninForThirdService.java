package com.venky.vip.day6.decorator.passport.upgrade;

import com.venky.vip.day6.decorator.passport.old.ISigninService;
import com.venky.vip.day6.decorator.passport.old.ResultMsg;

/**
 * 第三方服务登录
 *
 * @author Venkin
 * @date 2019/4/8
 **/
public interface ISigninForThirdService extends ISigninService {

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
