package com.venky.vip.day1.designprincipal.compositeaggregatereuse;

/**
 * mysql
 *
 * @author huwk
 * @date 2020/2/2
 **/
public class MysqlConnection extends Connection {
    @Override
    public String getConnection() {
        return "mysql连接";
    }
}
