package com.venky.vip.day5.template.course;

/**
 * 网络课程类
 * 模板，会有一个或者多个未实现的方法
 * 而且这几个未实现的方法有固定的执行顺序
 *
 * @author Venkin
 * @date 2019/4/1
 **/
public abstract class NetworkCourse {

    protected final void createCourse(){

        // 1、发布预习资料
        this.postPreResource();

        // 2、制作PPT课件
        this.createPPT();

        // 3、在线直播
        this.liveVideo();

        // 4、提交课件、课堂笔记
        this.postNote();

        // 5、提交源码
        this.postSource();

        // 6、不止作业，有些课程有作业，有些没有作业。
        // 如果有作业，检查作业，如果没有，那就不检查作业
        if (needHomework()) {
            this.checkHomework();
        }
    }

    abstract void checkHomework();

    // 钩子方法，实现流程的微调
    protected boolean needHomework() {
        return false;
    }

    final void postSource() {
        System.out.println("提交源代码");
    }

    final void postNote() {
        System.out.println("提交课件和笔记");
    }

    final void liveVideo() {
        System.out.println("直播授课");
    }

    final void createPPT() {
        System.out.println("创建备课PPT");
    }

    final void postPreResource(){
        System.out.println("分发预习资料");
    }

}
