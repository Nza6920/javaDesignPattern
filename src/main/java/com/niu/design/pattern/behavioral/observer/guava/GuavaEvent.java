package com.niu.design.pattern.behavioral.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * guava 观察者实现
 *
 * @version 1.0 [2021/01/07 14:45]
 * @author [nza]
 * @createTime [2021/01/07 14:45]
 */
public class GuavaEvent {

    @Subscribe
    public void subscribe(String str) {
        System.out.println("执行订阅方法, 参数: " + str);
    }
}
