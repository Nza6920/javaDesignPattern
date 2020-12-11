package com.niu.design.pattern.structural.proxy.db;

/**
 * 代理模式
 *
 * @version 1.0 [2020/12/08 10:11]
 * @author [nza]
 * @createTime [2020/12/08 10:11]
 */
public class DataSourceContextHolder {

    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<>();

    public static void setDBType(String dbType) {
        CONTEXT_HOLDER.set(dbType);
    }

    public static String getDBType() {
        return CONTEXT_HOLDER.get();
    }

    public static void clearDBType() {
        CONTEXT_HOLDER.remove();
    }
}
