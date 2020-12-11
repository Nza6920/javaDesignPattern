package com.niu.design.pattern.structural.proxy.db;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 代理模式
 * 数据源
 *
 * @version 1.0 [2020/12/08 10:10]
 * @author [nza]
 * @createTime [2020/12/08 10:10]
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDBType();
    }
}
