package com.niu.design.pattern.creational.simplefactory;

/**
 * Python 视频
 *
 * @author [nza]
 * @version 1.0 [2020/10/27 14:51]
 * @createTime [2020/10/27 14:51]
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制 Python 视频");
    }
}
