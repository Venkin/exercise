package com.venky.vip.day6.observer.events.core;

import java.lang.reflect.Method;

/**
 * 事件
 *
 * @author Venkin
 * @date 2019/4/9
 **/
public class Event {

    // 事件源，事件由谁发起的保存起来
    private Object source;

    // 事件触发，要通知谁
    private Object target;

    // 事件触发，要做什么动作，回调
    private Method callback;

    // 事件名称，触发的是什么事件
    private String trigger;

    // 事件触发的时间
    private long time;

    public Event(Object target,Method callback) {
        this.target = target;
        this.callback = callback;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Method getCallback() {
        return callback;
    }

    public void setCallback(Method callback) {
        this.callback = callback;
    }

    public String getTrigger() {
        return trigger;
    }

    public Event setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Event{");
        sb.append("source=").append(source);
        sb.append(", target=").append(target);
        sb.append(", callback=").append(callback);
        sb.append(", trigger='").append(trigger).append('\'');
        sb.append(", time=").append(time);
        sb.append('}');
        return sb.toString();
    }
}
