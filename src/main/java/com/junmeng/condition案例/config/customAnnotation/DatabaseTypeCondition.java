package com.junmeng.condition案例.config.customAnnotation;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * @author james
 * @date 2018/11/27
 */
public class DatabaseTypeCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata metadata) {
        Map<String, Object> attributes = metadata.getAnnotationAttributes(DatabaseType.class.getName());
        String type = (String) attributes.get("value");
        String enabledDBType = System.getProperty("dbType", "mysql");
        return (enabledDBType != null && type != null && enabledDBType.equalsIgnoreCase(type));
    }
}
