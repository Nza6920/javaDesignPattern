package com.niu.design.pattern.structural.proxy.staticproxy;

/**
 * 代理模式
 *
 * @author [nza]
 * @version 1.0 [2020/12/08 10:46]
 * @createTime [2020/12/08 10:46]
 */
public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);

        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}
