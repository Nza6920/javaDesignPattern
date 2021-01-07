package com.niu.design.pattern.behavioral.observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * Guava 观察者模式测试类
 *
 * @version 1.0 [2021/01/07 14:46]
 * @author [nza]
 * @createTime [2021/01/07 14:46]
 */
public class Test {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        GuavaEvent guavaEvent2 = new GuavaEvent();
        GuavaEvent guavaEvent3 = new GuavaEvent();
        GuavaEvent guavaEvent4 = new GuavaEvent();
        GuavaEvent guavaEvent5 = new GuavaEvent();

        eventBus.register(guavaEvent);
        eventBus.register(guavaEvent2);
        eventBus.register(guavaEvent3);
        eventBus.register(guavaEvent4);
        eventBus.register(guavaEvent5);

        eventBus.post("111");
    }
}
