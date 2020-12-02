package com.niu.design.pattern.structural.bridge;

/**
 * 桥接模式
 *
 * @version 1.0 [2020/12/02 15:34]
 * @author [nza]
 * @createTime [2020/12/02 15:34]
 */
public interface Account {

    Account openAccount();

    void showAccountType();
}
