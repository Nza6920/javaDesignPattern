package com.niu.design.pattern.creational.singleton;

/**
 * 单例模式 - 懒汉式(延迟加载)
 *
 * @author [nza]
 * @version 1.0 [2020/10/28 13:10]
 * @createTime [2020/10/28 13:10]
 */
public class LazySingleton {

    /**
     * 实例
     */
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {
        if (lazySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    /**
     * 获取实例
     *
     * @return {@link com.niu.design.pattern.creational.singleton.LazySingleton} 单例对象
     * @author nza
     * @createTime 2020/10/28 13:13
     */
    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
