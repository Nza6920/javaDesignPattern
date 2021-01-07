package com.niu.design.pattern.behavioral.command;

/**
 * 命令模式
 *
 * @author [nza]
 * @version 1.0 [2021/01/07 15:44]
 * @createTime [2021/01/07 15:44]
 */
public class CloseCourseVideoCommand implements Command {

    private CourseVideo courseVideo;

    public CloseCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.close();
    }
}
