package com.niu.design.pattern.structural.composite;

/**
 * 组合模式
 *
 * @version 1.0 [2020/12/02 14:23]
 * @author [nza]
 * @createTime [2020/12/02 14:23]
 */
public class Course extends CatalogComponent {

    private String name;

    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return name;
    }

    @Override
    public double getPrice(CatalogComponent catalogComponent) {
        return price;
    }

    @Override
    public void print() {
        System.out.println("Course Name: " + name + "Price: " + price);
    }
}
