package com.niu.design.pattern.creational.singleton;

/**
 * 单例模式 - 懒汉式(静态内部类)
 *
 * @author [nza]
 * @version 1.0 [2020/10/28 14:07]
 * @createTime [2020/10/28 14:07]
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {
        if (InnerClass.SINGLETON != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    /**
     * 利用静态内部类的初始化锁, 来实现单例
     */
    private static class InnerClass {
        private static final StaticInnerClassSingleton SINGLETON = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.SINGLETON;
    }
}
