package com.elegant.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 定义动态数据源，实现通过集成Spring提供的AbstractRoutingDataSource，只需要实现determineCurrentLookupKey方法即可
 * 
 * 由于DynamicDataSource是单例的，线程不安全的，所以采用ThreadLocal保证线程安全，由DynamicDataSourceHolder完成。
 * 
 * DynamicDataSource
 * 创建人:cool 
 * 时间：2018年3月10日-下午5:04:39 
 * @version 1.0.0
 *
 */
public class DynamicDataSource extends AbstractRoutingDataSource{

    @Override
    protected Object determineCurrentLookupKey() {
        // 使用DynamicDataSourceHolder保证线程安全，并且得到当前线程中的数据源key
    	System.out.println(" 这次请求的数据源是 "+DynamicDataSourceHolder.getDataSourceKey());
        return DynamicDataSourceHolder.getDataSourceKey();
    }

}
