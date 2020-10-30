package com.niu.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * 单例模式 - 饿汉式
 *
 * @author [nza]
 * @version 1.0 [2020/10/28 14:22]
 * @createTime [2020/10/28 14:22]
 */
public class HungrySingleton implements Serializable {

    private final static HungrySingleton HUNGRY_SINGLETON;

    static {
        HUNGRY_SINGLETON = new HungrySingleton();
    }

    private HungrySingleton() {
        if (HUNGRY_SINGLETON != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }

    /**
     * 重写对象序列化行为方法 (防止单例被破坏)
     *
     * @return {@link java.lang.Object}
     * @author nza
     * @createTime 2020/10/28 14:35
     */
    private Object readResolve() {
        return HUNGRY_SINGLETON;
    }
}
