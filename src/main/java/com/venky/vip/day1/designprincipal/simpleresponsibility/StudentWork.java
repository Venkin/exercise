package com.venky.vip.day1.designprincipal.simpleresponsibility;

/**
 * @author huwk
 * @date 2020/1/14
 **/
public class StudentWork {

    public static void main(String[] args) {

        LifeCoachTeacher lifeCoachTeacher = new LifeCoachTeacher();
        lifeCoachTeacher.buildClassCommittee();



        StudyCoachTeacher studyCoachTeacher = new StudyCoachTeacher();
        studyCoachTeacher.coachStudy();


    }

}
