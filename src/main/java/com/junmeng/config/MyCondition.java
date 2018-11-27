package com.junmeng.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author james
 * @date 2018/11/20
 */
public class MyCondition implements Condition {

    /**
     * 默认是false
     * @param conditionContext
     * @param annotatedTypeMetadata
     * @return
     */
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //判断当前系统是Mac，Windows，Linux
        Environment environment = conditionContext.getEnvironment();
        String property = environment.getProperty("os.name");
        boolean b = property.contains("Windows");
        return b;
    }
}
