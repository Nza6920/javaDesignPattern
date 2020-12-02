package com.niu.design.pattern.structural.bridge;

/**
 * 桥接模式
 *
 * @version 1.0 [2020/12/02 15:40]
 * @author [nza]
 * @createTime [2020/12/02 15:40]
 */
public abstract class Bank {

    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();
}
