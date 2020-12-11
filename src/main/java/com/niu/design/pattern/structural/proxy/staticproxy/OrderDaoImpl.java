package com.niu.design.pattern.structural.proxy.staticproxy;

/**
 * 代理模式
 * 静态代理
 *
 * @author [nza]
 * @version 1.0 [2020/12/08 09:55]
 * @createTime [2020/12/08 09:55]
 */
public class OrderDaoImpl implements IOrderDao {
    @Override
    public int insert(Order order) {
        System.out.println("Dao 层添加成功");
        return 0;
    }

    @Override
    public int update(Order order) {
        System.out.println("Dao 层更新成功");
        return 0;
    }
}
