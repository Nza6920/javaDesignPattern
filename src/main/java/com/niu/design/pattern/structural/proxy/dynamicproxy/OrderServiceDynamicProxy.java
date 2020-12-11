package com.niu.design.pattern.structural.proxy.dynamicproxy;

import com.niu.design.pattern.structural.proxy.db.DataSourceContextHolder;
import com.niu.design.pattern.structural.proxy.staticproxy.Order;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理模式
 * 动态代理
 *
 * @author [nza]
 * @version 1.0 [2020/12/08 11:06]
 * @createTime [2020/12/08 11:06]
 */
public class OrderServiceDynamicProxy implements InvocationHandler {

    private final Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind() {
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object orgObject = args[0];
        beforeMethod(orgObject);

        Object o = method.invoke(target, args);

        afterMethod();

        return o;
    }

    private void beforeMethod(Object obj) {
        int userId = 0;
        System.out.println("动态代理 before method");
        if (obj instanceof Order) {
            Order order = (Order) obj;
            userId = order.getUserId();
        }

        int dbRouter = userId % 2;
        // 设置 dataSource
        DataSourceContextHolder.setDBType(String.valueOf(dbRouter));
        System.out.println("动态代理分配到 " + dbRouter + " 处理数据.");
    }

    public void afterMethod() {
        System.out.println("静态代理 after code");
    }
}
