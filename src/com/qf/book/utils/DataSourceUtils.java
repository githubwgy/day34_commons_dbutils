package com.qf.book.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author wgy
 * @version V1.0
 * @Project day34_commons_dbutils
 * @Package com.qf.book.utils
 * @Description: ${TODO}
 * @Date 2021/4/13 10:14
 */
public class DataSourceUtils {
    private static DruidDataSource dataSource=null;
    static {
        try {
            Properties properties=new Properties();
            InputStream is = DataSourceUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            properties.load(is);
            is.close();
            dataSource= (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            System.out.println("初始数据源失败");
        }
    }
    public  static DataSource getDataSource(){
        return dataSource;
    }
}
