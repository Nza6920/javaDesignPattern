package com.niu.design.pattern.structural.proxy.staticproxy;

/**
 * 代理模式
 * 静态代理
 *
 * @author [nza]
 * @version 1.0 [2020/12/08 09:52]
 * @createTime [2020/12/08 09:52]
 */
public interface IOrderService {

    int saveOrder(Order order);

    int updateOrder(Order order);
}
