package com.venky.vip.day5.template.course;

/**
 * 大数据课程
 *
 * @author Venkin
 * @date 2019/4/1
 **/
public class BigDataCourse extends NetworkCourse {

    private boolean needHomeworkFlag = false;

    public BigDataCourse(boolean needHomeworkFlag) {
        this.needHomeworkFlag = needHomeworkFlag;
    }

    @Override
    void checkHomework() {
        System.out.println("检查大数据作业");
    }

    @Override
    protected boolean needHomework() {
        return this.needHomeworkFlag;
    }

}
