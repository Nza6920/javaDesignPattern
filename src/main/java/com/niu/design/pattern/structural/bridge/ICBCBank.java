package com.niu.design.pattern.structural.bridge;

/**
 * 桥接模式
 *
 * @version 1.0 [2020/12/02 15:45]
 * @author [nza]
 * @createTime [2020/12/02 15:45]
 */
public class ICBCBank extends Bank {

    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国工商银行账号");
        return account.openAccount();
    }
}
