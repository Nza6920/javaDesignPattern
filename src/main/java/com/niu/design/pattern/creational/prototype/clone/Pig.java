package com.niu.design.pattern.creational.prototype.clone;

import java.util.Date;

/**
 * 原型模式
 * 猪
 *
 * @author [nza]
 * @version 1.0 [2020/11/17 13:24]
 * @createTime [2020/11/17 13:24]
 */
public class Pig implements Cloneable {

    public Pig(String name, Date birth) {
        this.name = name;
        this.birth = birth;
    }

    /**
     * 性名
     */
    private String name;

    /**
     * 生日
     */
    private Date birth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 深克隆
        Pig pig = (Pig) super.clone();
        pig.birth = (Date) pig.birth.clone();
        return pig;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birth=" + birth +
                '}' + super.toString();
    }
}
