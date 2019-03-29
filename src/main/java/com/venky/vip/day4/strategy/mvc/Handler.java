package com.venky.vip.day4.strategy.mvc;

import java.lang.reflect.Method;

/**
 * 映射
 *
 * @author Venkin
 * @date 2019/3/29
 **/
public class Handler {

    private Object controller;
    private Method method;
    private String uri;

    public Object getController() {
        return controller;
    }

    public Handler setController(Object controller) {
        this.controller = controller;
        return this;
    }

    public Method getMethod() {
        return method;
    }

    public Handler setMethod(Method method) {
        this.method = method;
        return this;
    }

    public String getUri() {
        return uri;
    }

    public Handler setUri(String uri) {
        this.uri = uri;
        return this;
    }
}
