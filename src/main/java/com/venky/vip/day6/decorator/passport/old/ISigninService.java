package com.venky.vip.day6.decorator.passport.old;

/**
 * 登录服务接口
 *
 * @author Venkin
 * @date 2019/4/8
 **/
public interface ISigninService {

    /**
     * 注册方法
     *
     * @param username
     * @param password
     * @return
     */
    ResultMsg register(String username,String password);

    /**
     * 登录的方法
     *
     * @param username
     * @param password
     * @return
     */
    ResultMsg login(String username,String password);


}
