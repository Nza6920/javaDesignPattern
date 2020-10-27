package com.niu.design.pattern.creational.factorymethod;

/**
 * python 视频工厂
 *
 * @version 1.0 [2020/10/27 15:38]
 * @author [nza]
 * @createTime [2020/10/27 15:38]
 */
public class PythonVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
