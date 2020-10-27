package com.niu.design.pattern.creational.abstractfactory;

/**
 * java 文章
 *
 * @author [nza]
 * @version 1.0 [2020/10/27 16:07]
 * @createTime [2020/10/27 16:07]
 */
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("生成 JAVA 文章");
    }
}
