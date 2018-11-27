package com.junmeng.condition案例.config.datasource;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * -DconfigurePath=dbType
 * @author james
 * @date 2018/11/27
 */
public class MongoDBDatabaseTypeCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata metadata) {
        //获得系统参数dbType
        String enabledDBType = System.getProperty("dbType");
        return (enabledDBType != null && enabledDBType.equalsIgnoreCase("mongodb"));
    }
}