package com.venky.vip.day1.designprincipal.compositeaggregatereuse;

/**
 * @author huwk
 * @date 2020/2/2
 **/
public class Test {

    public static void main(String[] args) {

        BaseDao dao = new BaseDao();
        dao.setConnection(new PostsqlConnection());

        dao.add();
    }
}
