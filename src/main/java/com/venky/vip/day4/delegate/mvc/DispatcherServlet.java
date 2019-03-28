package com.venky.vip.day4.delegate.mvc;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet委派类
 *
 * 类似于项目经理的角色，来分发委派任务
 *
 * @author Venkin
 * @date 2019/3/27
 **/
public class DispatcherServlet extends HttpServlet {


    private void doDispatch(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String uri = request.getRequestURI();
        String mid = request.getParameter("mid");

        if ("getMemberById".equals(uri)) {
            new MemberController().getMemberById(mid);
        } else if ("getOrderById".equals(uri)) {
            new OrderController().getOrderById(mid);
        } else if ("logout".equals(uri)) {
            new SystemController().logout();
        } else {
            response.getWriter().write("404 resource not found");
        }
    }

    protected void service(HttpServletRequest request,HttpServletResponse response) {
        try {
            doDispatch(request,response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
