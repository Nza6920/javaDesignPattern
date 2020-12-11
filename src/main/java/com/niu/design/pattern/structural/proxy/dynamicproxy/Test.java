package com.niu.design.pattern.structural.proxy.dynamicproxy;

import com.niu.design.pattern.structural.proxy.staticproxy.IOrderService;
import com.niu.design.pattern.structural.proxy.staticproxy.Order;
import com.niu.design.pattern.structural.proxy.staticproxy.OrderServiceImpl;

/**
 * 代理模式
 * 动态代理
 *
 * @author [nza]
 * @version 1.0 [2020/12/08 11:18]
 * @createTime [2020/12/08 11:18]
 */
public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        IOrderService orderService = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        orderService.saveOrder(order);
        orderService.updateOrder(order);
    }
}
