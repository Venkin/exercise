package com.venky.vip.day6.decorator.passport.old;

/**
 * 登录服务
 *
 * @author Venkin
 * @date 2019/4/8
 **/
public class SigninService implements ISigninService{
    @Override
    public ResultMsg register(String username, String password) {
        return new ResultMsg(200,"注册成功",new Member());
    }

    @Override
    public ResultMsg login(String username, String password) {
        return new ResultMsg(200,"登录成功",new Member());
    }




}
