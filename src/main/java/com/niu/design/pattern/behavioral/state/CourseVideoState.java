package com.niu.design.pattern.behavioral.state;

/**
 * 状态模式
 *
 * @version 1.0 [2021/01/08 10:45]
 * @author [nza]
 * @createTime [2021/01/08 10:45]
 */
public abstract class CourseVideoState {

    protected CourseVideoContext courseVideoContext;

    public void setCourseVideoContext(CourseVideoContext courseVideoContext) {
        this.courseVideoContext = courseVideoContext;
    }

    /**
     * 播放
     */
    public abstract void play();

    /**
     * 暂停
     */
    public abstract void pause();

    /**
     * 加速
     */
    public abstract void speed();

    /**
     * 停止
     */
    public abstract void stop();
}
