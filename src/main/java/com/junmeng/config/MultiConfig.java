package com.junmeng.config;

import com.junmeng.Model.Abc;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author james
 * @date 2018/11/20
 */
@Configuration
@ConditionalOnProperty(value = "abc.property")
@ConditionalOnMissingClass(value = "Abc")
public class MultiConfig {

    @Bean
    @ConditionalOnMissingBean(Abc.class)
    public String check() {
        System.out.println("multi check");
        return "check";
    }

}
