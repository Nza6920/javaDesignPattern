package com.niu.design.pattern.creational.singleton;

/**
 * 单例模式 - 懒汉式(双重检查)
 *
 * @author [nza]
 * @version 1.0 [2020/10/28 13:41]
 * @createTime [2020/10/28 13:41]
 */
public class LazyDoubleCheckSingleton {
    /**
     * 实例 (防止指令重排序)
     */
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    /**
     * 获取实例
     *
     * @return {@link com.niu.design.pattern.creational.singleton.LazyDoubleCheckSingleton} 单例对象
     * @author nza
     * @createTime 2020/10/28 13:13
     */
    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            // 双重检查提高性能 - 又是一个极小的细节 (๑•̀ㅂ•́)و✧
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
