package com.venky.vip.day1.designprincipal.openclose;

/**
 * 课程
 *
 * @author huwk
 * @date 2020/1/12
 **/
public interface Course {

    /**
     * 课程编号
     *
     * @return
     */
    Integer getNo();

    /**
     * 课程名称
     *
     * @return
     */
    String getName();

    /**
     * 课程价格
     *
     * @return
     */
    Double getPrice();
}
