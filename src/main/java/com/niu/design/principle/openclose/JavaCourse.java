package com.niu.design.principle.openclose;

/**
 * 开闭原则 - java课程
 *
 * @author [nza]
 * @version 1.0 [2020/07/15 14:56]
 * @createTime [2020/07/15 14:56]
 */
public class JavaCourse implements ICourse {

    private Integer id;

    private String name;

    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
