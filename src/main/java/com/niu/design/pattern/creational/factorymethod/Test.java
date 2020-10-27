package com.niu.design.pattern.creational.factorymethod;

/**
 * 工厂方法 产品等级
 *
 * @author [nza]
 * @version 1.0 [2020/10/27 14:52]
 * @createTime [2020/10/27 14:52]
 */
public class Test {
    public static void main(String[] args) {

        JavaVideoFactory factory = new JavaVideoFactory();
        Video video = factory.getVideo();
        video.produce();
    }
}
