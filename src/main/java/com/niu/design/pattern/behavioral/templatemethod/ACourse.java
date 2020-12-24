package com.niu.design.pattern.behavioral.templatemethod;

/**
 * 模板方法
 *
 * @version 1.0 [2020/12/24 14:01]
 * @author [nza]
 * @createTime [2020/12/24 14:01]
 */
public abstract class ACourse {

    protected final void makeCourse() {
        makePPT();
        makeVideo();
        if (needWriteArticle()) {
            writeArticle();
        }

        // 打包课程
        packageCourse();
    }

    final void makePPT() {
        System.out.println("制作PPT");
    }

    final void makeVideo() {
        System.out.println("制作视频");
    }

    final void writeArticle() {
        System.out.println("编写手记");
    }

    // 钩子方法
    protected boolean needWriteArticle() {
        return false;
    }

    abstract void packageCourse();
}
