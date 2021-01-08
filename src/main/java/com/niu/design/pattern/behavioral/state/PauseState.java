package com.niu.design.pattern.behavioral.state;

/**
 * 状态模式
 *
 * @version 1.0 [2021/01/08 10:48]
 * @author [nza]
 * @createTime [2021/01/08 10:48]
 */
public class PauseState extends CourseVideoState {
    @Override
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void pause() {
        System.out.println("暂停播放");
    }

    @Override
    public void speed() {
        System.out.println("无法加速");
    }

    @Override
    public void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
