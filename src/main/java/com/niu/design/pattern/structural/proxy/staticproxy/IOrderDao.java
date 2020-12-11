package com.niu.design.pattern.structural.proxy.staticproxy;

/**
 * 代理模式
 * 静态代理
 *
 * @author [nza]
 * @version 1.0 [2020/12/08 09:54]
 * @createTime [2020/12/08 09:54]
 */
public interface IOrderDao {

    int insert(Order order);

    int update(Order order);
}
