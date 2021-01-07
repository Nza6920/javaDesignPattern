package com.niu.design.pattern.behavioral.mediator;

/**
 * 中介者模式
 *
 * @version 1.0 [2021/01/07 16:22]
 * @author [nza]
 * @createTime [2021/01/07 16:22]
 */
public class User {

    public User(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        StudyGroup.showMessage(this, message);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
