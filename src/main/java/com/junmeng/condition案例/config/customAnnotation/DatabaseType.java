package com.junmeng.condition案例.config.customAnnotation;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * Created by james on 2018/11/27.
 */
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(DatabaseTypeCondition.class)
public @interface DatabaseType {
    String value();
}
