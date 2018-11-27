package com.junmeng.config;

import com.junmeng.Model.Abc;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 *
 *
 * @Conditional(MyCondition.class)
 * 这句代码可以标注在类上面，表示该类下面的所有@Bean都会启用配置
 * 也可以标注在方法上面，只是对该方法启用配置
 * 除了自己自定义Condition之外，Spring还提供了很多Condition给我们用
 *  @ConditionalOnBean（仅仅在当前上下文中存在某个对象时，才会实例化一个Bean）
 *  @ConditionalOnClass（某个class位于类路径上，才会实例化一个Bean）
 *  @ConditionalOnExpression（当表达式为true的时候，才会实例化一个Bean）
 *  @ConditionalOnMissingBean（仅仅在当前上下文中不存在某个对象时，才会实例化一个Bean）
 *  @ConditionalOnMissingClass（某个class类路径上不存在的时候，才会实例化一个Bean）
 *  @ConditionalOnNotWebApplication（不是web应用）
 * @author james
 * @date 2018/11/20
 */
@Configuration
public class Config {

    @Conditional(MyCondition.class)
    @Bean
    public String condition() {
        System.out.println("自定义的condition的match方法返回值为true时，才会进入该方法创建bean");
        return "";
    }

    /**
     * 存在ABC类的实例时
     */
    @ConditionalOnBean(Abc.class)
    @Bean
    public String bean() {
        System.out.println("ConditionalOnBean is exist");
        return "";
    }

    @ConditionalOnMissingBean(Abc.class)
    @Bean
    public String missBean() {
        System.out.println("ConditionalOnBean is missing");
        return "";
    }

    /**
     * 表达式为true时
     */
    @ConditionalOnExpression(value = "true")
    @Bean
    public String expression() {
        System.out.println("expression is true");
        return "";
    }

    /**
     * 这个注解能够控制某个configuration是否生效。
     * 具体操作是通过其两个属性name以及havingValue来实现的，
     * 其中name用来从application.properties中读取某个属性值，如果该值为空，则返回false;
     * 如果值不为空，则将该值与havingValue指定的值进行比较，如果一样则返回true;否则返回false。
     * 如果返回值为false，则该configuration不生效；为true则生效。
     *
     * 如果synchronize在配置文件中并且值为true
     */
    @ConditionalOnProperty(name = "synchronize", havingValue = "true")
    @Bean
    public String property() {
        System.err.println("synchronize is true");
        return "";
    }



}
