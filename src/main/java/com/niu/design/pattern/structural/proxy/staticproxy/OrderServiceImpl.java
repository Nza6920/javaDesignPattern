package com.niu.design.pattern.structural.proxy.staticproxy;

/**
 * 代理模式
 * 静态代理
 *
 * @author [nza]
 * @version 1.0 [2020/12/08 09:56]
 * @createTime [2020/12/08 09:56]
 */
public class OrderServiceImpl implements IOrderService {

    public OrderServiceImpl() {
        this.orderDao = new OrderDaoImpl();
    }

    private final IOrderDao orderDao;

    @Override
    public int saveOrder(Order order) {
        orderDao.insert(order);
        System.out.println("Service 层调用 Dao 层");
        return 0;
    }

    @Override
    public int updateOrder(Order order) {
        orderDao.update(order);
        System.out.println("Service 层调用 Dao 层");
        return 0;
    }
}
