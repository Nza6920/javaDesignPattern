package com.niu.design.pattern.creational.singleton;

/**
 * 线程单例
 *
 * @version 1.0 [2020/10/29 16:31]
 * @author [nza]
 * @createTime [2020/10/29 16:31]
 */
public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance> INSTANCE = new ThreadLocal<ThreadLocalInstance>() {
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    private ThreadLocalInstance() {
    }

    public static ThreadLocalInstance getInstance() {
        return INSTANCE.get();
    }
}
