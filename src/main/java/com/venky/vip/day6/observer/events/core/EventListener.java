package com.venky.vip.day6.observer.events.core;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 监听器，是观察者的桥梁
 *
 * @author Venkin
 * @date 2019/4/9
 **/
public class EventListener {

    // JDK底层的Listener也是这样设计的
    protected Map<String,Event> events = new HashMap<>();

    // 事件名称和一个目标对象来触发事件
    public void addListener(String eventType,Object target) {
        try {
            this.addListener(eventType, target,
                    target.getClass().getMethod("on" + toUpperFirstCase(eventType), Event.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addListener(String eventType, Object target, Method method) {
        // 注册事件
        events.put(eventType,new Event(target,method));
    }

    // 触发，只要有动作就触发
    private void trigger(Event event){
        event.setSource(this);
        event.setTime(System.currentTimeMillis());

        try {
            // 发起回调
            if (event.getCallback() != null) {
                event.getCallback().invoke(event.getTarget(), event);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void trigger(String trigger){

        if (!this.events.containsKey(trigger)) {
            trigger(this.events.get(trigger).setTrigger(trigger));
        }
    }

    // 首字母大写
    private String toUpperFirstCase(String eventType) {
        char[] chars = eventType.toCharArray();
        chars[0] -= 32;
        return String.valueOf(chars);
    }

}
