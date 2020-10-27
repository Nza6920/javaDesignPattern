package com.niu.design.pattern.creational.factorymethod;

/**
 * java 视频
 *
 * @author [nza]
 * @version 1.0 [2020/10/27 14:50]
 * @createTime [2020/10/27 14:50]
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制 Java 视频");
    }
}
