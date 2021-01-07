package com.niu.design.pattern.behavioral.command;

/**
 * 命令模式
 *
 * @version 1.0 [2021/01/07 15:42]
 * @author [nza]
 * @createTime [2021/01/07 15:42]
 */
public class CourseVideo {

    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println("打开: " + name);
    }

    public void close() {
        System.out.println("关闭: " + name);
    }
}
