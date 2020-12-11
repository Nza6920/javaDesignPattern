package com.niu.design.pattern.structural.proxy.staticproxy;

import com.niu.design.pattern.structural.proxy.db.DataSourceContextHolder;

/**
 * 代理模式
 * 静态代理
 *
 * @author [nza]
 * @version 1.0 [2020/12/08 10:02]
 * @createTime [2020/12/08 10:02]
 */
public class OrderServiceStaticProxy {

    private final IOrderService iOrderService;

    public OrderServiceStaticProxy() {
        this.iOrderService = new OrderServiceImpl();
    }

    public int saveOrder(Order order) {
        beforeMethod(order);
        int res = iOrderService.saveOrder(order);
        afterMethod();
        return res;
    }

    private void beforeMethod(Order order) {
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        // 设置 dataSource
        DataSourceContextHolder.setDBType(String.valueOf(dbRouter));
        System.out.println("静态代理分配到 " + dbRouter + " 处理数据.");
        System.out.println("静态代理 before code");
    }

    private void afterMethod() {
        System.out.println("静态代理 after code");
    }
}
