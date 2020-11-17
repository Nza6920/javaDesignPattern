package com.niu.design.pattern.creational.prototype;

/**
 * 原型模式
 *
 * @author [nza]
 * @version 1.0 [2020/10/30 13:24]
 * @createTime [2020/10/30 13:24]
 */
public class Mail implements Cloneable {

    public Mail() {
        System.out.println("Mail Create");
    }

    /**
     * 名称
     */
    private String name;

    /**
     * 邮件地址
     */
    private String emailAddress;

    /**
     * 邮件内容
     */
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", content='" + content + '\'' +
                '}' + super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone mail object");
        return super.clone();
    }
}
