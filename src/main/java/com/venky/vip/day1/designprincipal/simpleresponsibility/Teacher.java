package com.venky.vip.day1.designprincipal.simpleresponsibility;

/**
 * @author huwk
 * @date 2020/1/14
 **/
public interface Teacher {

    /**
     * 班委建设
     */
    void buildClassCommittee();

    /**
     * 出勤统计
     */
    void countAttendance();

    /**
     * 心理辅导
     */
    void coachPsychology();

    /**
     * 费用催缴
     */
    void callFee();

    /**
     * 班级管理
     */
    void manageClass();

    /**
     * 专业指导
     */
    void guideSpeciality();

    /**
     * 学习辅导
     */
    void coachStudy();

    /**
     * 科研指导
     */
    void guideScientificResearch();

    /**
     * 学习总结
     */
    void summarizeStudy();
}
