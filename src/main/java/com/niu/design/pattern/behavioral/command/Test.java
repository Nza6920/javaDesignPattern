package com.niu.design.pattern.behavioral.command;

/**
 * 命令模式
 *
 * @version 1.0 [2021/01/07 15:49]
 * @author [nza]
 * @createTime [2021/01/07 15:49]
 */
public class Test {

    public static void main(String[] args) {

        CourseVideo courseVideo = new CourseVideo("java 设计模式精讲");

        OpenCourseVideoCommand openCommand = new OpenCourseVideoCommand(courseVideo);
        CloseCourseVideoCommand closeCommand = new CloseCourseVideoCommand(courseVideo);

        Staff staff = new Staff();
        staff.addCommand(openCommand);
        staff.addCommand(closeCommand);

        staff.executeCommands();
    }
}
