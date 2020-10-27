package com.niu.design.pattern.creational.abstractfactory;

/**
 * java 视频
 *
 * @version 1.0 [2020/10/27 16:07]
 * @author [nza]
 * @createTime [2020/10/27 16:07]
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("生成 JAVA 视频");
    }
}
