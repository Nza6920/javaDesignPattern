package com.niu.design.pattern.behavioral.command;

/**
 * 命令模式
 *
 * @version 1.0 [2021/01/07 15:43]
 * @author [nza]
 * @createTime [2021/01/07 15:43]
 */
public class OpenCourseVideoCommand implements Command {

    private CourseVideo courseVideo;

    public OpenCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.open();
    }
}
