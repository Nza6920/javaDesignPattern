package com.niu.design.pattern.behavioral.memento;

/**
 * 备忘录模式
 *
 * @author [nza]
 * @version 1.0 [2021/01/07 15:09]
 * @createTime [2021/01/07 15:09]
 */
public class ArticleMemento {

    private String title;

    private String content;

    private String img;

    public ArticleMemento(String title, String content, String img) {
        this.title = title;
        this.content = content;
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getImg() {
        return img;
    }

    @Override
    public String toString() {
        return "ArticleMemento{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}
