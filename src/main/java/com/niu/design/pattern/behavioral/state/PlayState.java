package com.niu.design.pattern.behavioral.state;

/**
 * 状态模式
 *
 * @version 1.0 [2021/01/08 10:48]
 * @author [nza]
 * @createTime [2021/01/08 10:48]
 */
public class PlayState extends CourseVideoState {
    @Override
    public void play() {
        System.out.println("正常播放");
    }

    @Override
    public void pause() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PAUSE_STATE);
    }

    @Override
    public void speed() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED_STATE);
    }

    @Override
    public void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
