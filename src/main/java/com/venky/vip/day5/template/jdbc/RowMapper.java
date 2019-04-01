package com.venky.vip.day5.template.jdbc;

import java.sql.ResultSet;

/**
 * 课程
 *
 * @author Venkin
 * @date 2019/4/1
 **/
public interface RowMapper<T> {

    T mapRow(ResultSet rs,int rowNum) throws Exception;

}
