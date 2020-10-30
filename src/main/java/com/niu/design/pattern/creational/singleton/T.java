package com.niu.design.pattern.creational.singleton;

/**
 * 线程测试类
 *
 * @author [nza]
 * @version 1.0 [2020/10/28 13:16]
 * @createTime [2020/10/28 13:16]
 */
public class T implements Runnable {
    @Override
    public void run() {
//        LazySingleton instance = LazySingleton.getInstance();
//        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
//        StaticInnerClassSingleton staticInnerClassSingleton = StaticInnerClassSingleton.getInstance();
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + "--" + hungrySingleton);
    }
}
