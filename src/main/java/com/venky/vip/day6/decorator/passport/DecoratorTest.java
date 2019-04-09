package com.venky.vip.day6.decorator.passport;

import com.venky.vip.day6.decorator.passport.old.SigninService;
import com.venky.vip.day6.decorator.passport.upgrade.ISigninForThirdService;
import com.venky.vip.day6.decorator.passport.upgrade.SigninForThirdService;

/**
 * 登录测试类
 *
 * @author Venkin
 * @date 2019/4/8
 **/
public class DecoratorTest {

    public static void main(String[] args) {

        ISigninForThirdService signinForThirdService = new SigninForThirdService(new SigninService());

        signinForThirdService.loginForQQ("sdfsdfsdf");

        // 为某个类实现动态增加或者覆盖原有的方法的情况，采用装饰着模式


    }
}
