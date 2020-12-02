package com.niu.design.pattern.structural.bridge;

/**
 * 桥接模式
 *
 * @version 1.0 [2020/12/02 15:36]
 * @author [nza]
 * @createTime [2020/12/02 15:36]
 */
public class DepositAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开定期账号");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}
