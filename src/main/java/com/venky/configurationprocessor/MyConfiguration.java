package com.venky.configurationprocessor;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 配置
 *
 * @author huwk
 * @date 2019/7/19
 **/
@ConfigurationProperties(prefix = "kuan")
@Component
public class MyConfiguration {

    private String name;
    private Integer age;
    private String gender;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
