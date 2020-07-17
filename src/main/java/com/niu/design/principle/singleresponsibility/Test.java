package com.niu.design.principle.singleresponsibility;

/**
 * 单一职责 - 测试类
 *
 * @version 1.0 [2020/07/17 13:43]
 * @author [nza]
 * @createTime [2020/07/17 13:43]
 */
public class Test {

    public static void main(String[] args) {
        FlyBird bird1 = new FlyBird();
        bird1.mainMoveMode("大雁");

        WalkBird bird2 = new WalkBird();
        bird2.mainMoveMode("鸵鸟");
    }
}
