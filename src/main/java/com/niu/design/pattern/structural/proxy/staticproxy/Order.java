package com.niu.design.pattern.structural.proxy.staticproxy;

/**
 * 代理模式
 *
 * @author [nza]
 * @version 1.0 [2020/12/08 09:49]
 * @createTime [2020/12/08 09:49]
 */
public class Order {

    private Object orderInfo;

    private Integer userId;

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
