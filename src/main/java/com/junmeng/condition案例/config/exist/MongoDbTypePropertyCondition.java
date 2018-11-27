package com.junmeng.condition案例.config.exist;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author james
 * @date 2018/11/27
 */
public class MongoDbTypePropertyCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata metadata) {
        String dbType = conditionContext.getEnvironment().getProperty("app.dbType");
        return "mongodb".equalsIgnoreCase(dbType);
    }
}
