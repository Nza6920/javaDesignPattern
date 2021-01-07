package com.niu.design.pattern.behavioral.memento;

/**
 * 备忘录模式
 *
 * @author [nza]
 * @version 1.0 [2021/01/07 15:19]
 * @createTime [2021/01/07 15:19]
 */
public class Test {
    public static void main(String[] args) {

        ArticleMementoManager mementoManager = new ArticleMementoManager();

        Article article = new Article("1", "2", "3");

        // 暂存
        ArticleMemento articleMemento = article.saveToMemento();
        mementoManager.addMemento(articleMemento);
        System.out.println("暂存: ");
        System.out.println(article);


        // 修改
        System.out.println("修改: ");
        article.setTitle("aa");
        article.setImg("bb");
        article.setContent("cc");
        System.out.println(article);


        // 回退
        article.undoFromMemento(mementoManager.getMemento());
        System.out.println("回退: ");
        System.out.println(article);
    }
}
