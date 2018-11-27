package com.junmeng.condition案例.config;

import com.junmeng.condition案例.config.customAnnotation.DatabaseType;
import com.junmeng.condition案例.config.datasource.MongoDBDatabaseTypeCondition;
import com.junmeng.condition案例.config.datasource.MySQLDatabaseTypeCondition;
import com.junmeng.condition案例.config.driver.MongoDriverPresentsCondition;
import com.junmeng.condition案例.dao.UserDAO;
import com.junmeng.condition案例.dao.impl.JdbcUserDAO;
import com.junmeng.condition案例.dao.impl.MongoUserDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author james
 * @date 2018/11/27
 */
@Configuration
public class Demo2DataSourceConfig {

//    @Bean
//    @Conditional({MySQLDatabaseTypeCondition.class})
//    public UserDAO jdbcUserDAO() {
//        return new JdbcUserDAO();
//    }
//
//    @Bean
//    @Conditional({MongoDBDatabaseTypeCondition.class})
//    public UserDAO mongoUserDAO() {
//        return new MongoUserDAO();
//    }

    @Bean
    @DatabaseType("mysql")
    public UserDAO jdbcUserDAO() {
        return new JdbcUserDAO();
    }

    @Bean
    @DatabaseType("mongodb")
    public UserDAO mongoUserDAO() {
        return new MongoUserDAO();
    }

}
