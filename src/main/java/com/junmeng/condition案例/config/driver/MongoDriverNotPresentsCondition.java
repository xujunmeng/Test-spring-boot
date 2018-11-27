package com.junmeng.condition案例.config.driver;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author james
 * @date 2018/11/27
 */
public class MongoDriverNotPresentsCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata metadata) {
        try {
            Class.forName("com.mongodb.Server");
            return false;
        } catch (ClassNotFoundException e) {
            return true;
        }
    }
}
