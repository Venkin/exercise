package com.venky.vip.day1.designprincipal.compositeaggregatereuse;

/**
 * postsql
 *
 * @author huwk
 * @date 2020/2/2
 **/
public class PostsqlConnection extends Connection {
    @Override
    public String getConnection() {
        return "postsql连接";
    }
}
