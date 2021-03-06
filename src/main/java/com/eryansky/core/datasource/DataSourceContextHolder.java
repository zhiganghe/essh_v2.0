/**
 *  Copyright (c) 2012-2014 http://www.eryansky.com
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.eryansky.core.datasource;

/**
 * @author 尔演&Eryan eryanwcp@gmail.com
 * @date 2014-08-13
 */
public abstract class DataSourceContextHolder {

    public final static String DATA_SOURCE_DEFAULT = "dataSource";
    public final static String DATA_SOURCE_MYSQL = "dataSource2";
    public final static String SESSION_FACTORY_MYSQL = "mysql";
    public final static String SESSION_FACTORY_ORACLE = "oracle";

    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

    public static void setDataSourceType(String dataSourceType) {
        contextHolder.set(dataSourceType);
    }

    public static String getDataSourceType() {
        return contextHolder.get();
    }

    public static void clearDataSourceType() {
        contextHolder.remove();
    }
}