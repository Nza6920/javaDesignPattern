package com.niu.design.pattern.structural.bridge;

/**
 * 桥接模式
 *
 * @version 1.0 [2020/12/02 15:37]
 * @author [nza]
 * @createTime [2020/12/02 15:37]
 */
public class SavingAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开活期账号");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }
}
