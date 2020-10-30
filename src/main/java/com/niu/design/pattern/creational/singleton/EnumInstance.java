package com.niu.design.pattern.creational.singleton;

/**
 * 枚举实例
 *
 * @author [nza]
 * @version 1.0 [2020/10/29 10:54]
 * @createTime [2020/10/29 10:54]
 */
public enum EnumInstance {
    /**
     * 单例对象
     */
    INSTANCE;

    /**
     * 单例实体
     */
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }
}
