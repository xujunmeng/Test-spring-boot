package com.junmeng.profile案例;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author james
 * @date 2018/11/27
 */
@Configuration
public class DataSourceConfig {

    @Bean
    @Profile("DEV")
    public DataSource devDataSource() throws Exception {
        System.out.println("DataSourceConfig.devDataSource 执行....");
        return BasicDataSourceFactory.createDataSource(new Properties());
    }

    @Bean
    @Profile("UAT")
    public DataSource uatDataSource() throws Exception {
        System.out.println("DataSourceConfig.uatDataSource 执行....");
        return BasicDataSourceFactory.createDataSource(new Properties());
    }

}
