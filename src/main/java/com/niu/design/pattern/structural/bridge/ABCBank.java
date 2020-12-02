package com.niu.design.pattern.structural.bridge;

/**
 * 桥接模式
 *
 * @author [nza]
 * @version 1.0 [2020/12/02 15:44]
 * @createTime [2020/12/02 15:44]
 */
public class ABCBank extends Bank {

    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        return account.openAccount();
    }
}
