package com.niu.design.principle.openclose;

/**
 * 开闭原则 - 课程
 * 对扩展开放， 对修改关闭
 *
 * @author [nza]
 * @version 1.0 [2020/07/15 14:54]
 * @createTime [2020/07/15 14:54]
 */
public interface ICourse {
    /**
     * 获取id
     *
     * @author nza
     * @createTime 2020/7/15 15:11
     * @return java.lang.Double
     */
    Integer getId();

    /**
     * 获取名称
     *
     * @author nza
     * @createTime 2020/7/15 15:11
     * @return java.lang.Double
     */
    String getName();

    /**
     * 获取价格
     *
     * @author nza
     * @createTime 2020/7/15 15:11
     * @return java.lang.Double
     */
    Double getPrice();
}
