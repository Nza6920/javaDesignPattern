package com.niu.design.pattern.behavioral.mediator;

/**
 * 中介者模式
 *
 * @version 1.0 [2021/01/07 16:25]
 * @author [nza]
 * @createTime [2021/01/07 16:25]
 */
public class Test {

    public static void main(String[] args) {
        User user = new User("bob");

        user.sendMessage("are you gay?");
    }
}
