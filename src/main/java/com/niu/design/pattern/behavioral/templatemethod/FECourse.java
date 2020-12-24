package com.niu.design.pattern.behavioral.templatemethod;

/**
 * 模板方法
 *
 * @version 1.0 [2020/12/24 14:08]
 * @author [nza]
 * @createTime [2020/12/24 14:08]
 */
public class FECourse extends ACourse {


    public FECourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    private boolean needWriteArticleFlag;

    @Override
    void packageCourse() {
        System.out.println("提供课程的前端代码");
        System.out.println("提供课程的图片等多媒体资料");
    }

    @Override
    protected boolean needWriteArticle() {
        return this.needWriteArticleFlag;
    }
 }
