package com.niu.design.principle.openclose;

/**
 * 开闭原则 - java打折课程
 *
 * @author [nza]
 * @version 1.0 [2020/07/15 15:13]
 * @createTime [2020/07/15 15:13]
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    /**
     * 获取原价
     *
     * @return java.lang.Double
     * @author nza
     * @createTime 2020/7/15 15:17
     */
    public Double getOriginPrice() {
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
}
