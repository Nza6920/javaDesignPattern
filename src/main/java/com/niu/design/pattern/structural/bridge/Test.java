package com.niu.design.pattern.structural.bridge;

/**
 * <功能简述>
 *
 * @version 1.0 [2020/12/02 15:53]
 * @author [nza]
 * @createTime [2020/12/02 15:53]
 */
public class Test {

    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();

        Bank abcBank = new ABCBank(new SavingAccount());
        Account abcAccount = abcBank.openAccount();
        abcAccount.showAccountType();
    }
}
