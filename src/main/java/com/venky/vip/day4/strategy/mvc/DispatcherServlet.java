package com.venky.vip.day4.strategy.mvc;

import com.venky.vip.day4.delegate.mvc.MemberController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet委派类
 *
 * 类似于项目经理的角色，来分发委派任务
 *
 * 使用策略模式优化
 *
 * @author Venkin
 * @date 2019/3/27
 **/
public class DispatcherServlet extends HttpServlet {

    private List<Handler> handlerMapping = new ArrayList<>();

    private void doDispatch(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String uri = request.getRequestURI();
        String mid = request.getParameter("mid");

        // 拿到url去handlerMapping（策略常量）中找，
        Handler handler = null;
        for (Handler h : handlerMapping) {
            if (uri.equals(h.getUri())) {
                handler = h;
                break;
            }
        }
        // 将具体的任务分发给method
        Object object = null;
        try {
            object = handler.getMethod().invoke(handler.getController(),mid);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    protected void service(HttpServletRequest request,HttpServletResponse response) {
        try {
            doDispatch(request,response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void init() throws ServletException {
        Class<?> memberControllerClass = MemberController.class;
        try {
            handlerMapping.add(new Handler().setController(memberControllerClass.newInstance())
            .setMethod(memberControllerClass.getMethod("getMemberById", new Class[]{String.class}))
            .setUri("/getMemberById.json"));
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


    }
}
