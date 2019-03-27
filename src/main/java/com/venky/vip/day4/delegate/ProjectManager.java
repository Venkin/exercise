package com.venky.vip.day4.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * 项目经理类
 *
 * @author Venkin
 * @date 2019/3/24
 **/
public class ProjectManager implements IEmployee {

    private Map<String,IEmployee> targets = new HashMap<>();

    public ProjectManager() {
        targets.put("加密",new EmployeeA());
        targets.put("登录",new EmployeeB());
    }

    /**
     * 项目经理只负责分配任务，不干活
     *
     * @param command
     */
    @Override
    public void work(String command) {
        targets.get(command).work(command);
    }
}
