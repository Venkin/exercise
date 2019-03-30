package com.venky.model;

/**
 * 学生
 *
 * @author Venkin
 * @date 2019/3/29
 **/
public class Student extends Person {

    private String sno;
    private String grade;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
