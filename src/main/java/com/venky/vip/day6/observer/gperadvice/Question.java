package com.venky.vip.day6.observer.gperadvice;

/**
 * @author Venkin
 * @date 2019/4/8
 **/
public class Question {

    private String asker;

    private String username;

    private String password;

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAsker() {
        return asker;
    }

    public void setAsker(String asker) {
        this.asker = asker;
    }
}
