package com.venky.vip.day4.delegate;

/**
 * 公司老板
 *
 * @author Venkin
 * @date 2019/3/24
 **/
public class Boss {

    public void command(String command,ProjectManager projectManager) {
        projectManager.work(command);
    }
}
