package com.niu.design.pattern.behavioral.state;

/**
 * 状态模式
 *
 * @author [nza]
 * @version 1.0 [2021/01/08 11:04]
 * @createTime [2021/01/08 11:04]
 */
public class Test {

    public static void main(String[] args) {
        CourseVideoContext courseVideoContext = new CourseVideoContext();
        courseVideoContext.setCourseVideoState(new PlayState());
        System.out.println("当前状态: " + courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoContext.pause();
        System.out.println("当前状态: " + courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoContext.speed();
        System.out.println("当前状态: " + courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoContext.stop();
        System.out.println("当前状态: " + courseVideoContext.getCourseVideoState().getClass().getSimpleName());
    }
}
