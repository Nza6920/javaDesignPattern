package com.niu.design.pattern.creational.simplefactory;

/**
 * 简单工厂
 *
 * @author [nza]
 * @version 1.0 [2020/10/27 14:52]
 * @createTime [2020/10/27 14:52]
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");

        Video video = videoFactory.getVideo(JavaVideo.class);
        video.produce();
    }
}
