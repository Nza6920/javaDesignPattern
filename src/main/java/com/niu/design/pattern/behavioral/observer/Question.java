package com.niu.design.pattern.behavioral.observer;

/**
 * 观察者模式
 * 问题
 *
 * @version 1.0 [2021/01/07 14:13]
 * @author [nza]
 * @createTime [2021/01/07 14:13]
 */
public class Question {

    private String username;

    private String content;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Question{" +
                "username='" + username + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
