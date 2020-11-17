package com.niu.design.pattern.structural.decorator.v1;

/**
 * 测试类
 *
 * @author [nza]
 * @version 1.0 [2020/11/17 14:56]
 * @createTime [2020/11/17 14:56]
 */
public class Test {

    public static void main(String[] args) {
        BatterCake batterCake = new BatterCake();
        System.out.println(batterCake.getDesc());

        BatterCakeWithEgg batterCakeWithEgg = new BatterCakeWithEgg();
        System.out.println(batterCakeWithEgg.getDesc());

        BatterCakeWithEggSausage batterCakeWithEggSausage = new BatterCakeWithEggSausage();
        System.out.println(batterCakeWithEggSausage.getDesc());
    }
}
