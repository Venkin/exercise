package com.venky.vip.day6.decorator.passport.upgrade;

import com.venky.vip.day6.decorator.passport.old.ISigninService;
import com.venky.vip.day6.decorator.passport.old.ResultMsg;

/**
 * 第三方登录服务
 *
 * @author Venkin
 * @date 2019/4/8
 **/
public class SigninForThirdService implements ISigninForThirdService {

    private ISigninService iSigninService;

    public SigninForThirdService(ISigninService iSigninService){
        this.iSigninService = iSigninService;
    }

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

    @Override
    public ResultMsg register(String username, String password) {
        return this.iSigninService.register(username,password);
    }

    @Override
    public ResultMsg login(String username, String password) {
        return this.iSigninService.login(username,password);
    }
}
