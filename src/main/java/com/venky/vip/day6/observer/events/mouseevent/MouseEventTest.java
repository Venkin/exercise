package com.venky.vip.day6.observer.events.mouseevent;

/**
 * 鼠标事件测试
 *
 * @author Venkin
 * @date 2019/4/9
 **/
public class MouseEventTest {

    public static void main(String[] args) {

        MouseEventCallback callback = new MouseEventCallback();

        // 注册事件
        Mouse mouse = new Mouse();
        mouse.addListener(MouseEventType.ON_CLICK,callback);

        // 调用方法
        mouse.click();

        //
    }
}
