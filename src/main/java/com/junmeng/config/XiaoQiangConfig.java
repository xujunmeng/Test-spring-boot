package com.junmeng.config;

import com.junmeng.strategy.Fighter;
import com.junmeng.strategy.impl.XiaoQiang;
import com.junmeng.strategy.impl.ZhangSan;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author james
 * @date 2018/11/18
 */
@Configuration
@ConditionalOnClass(ZhangSan.class)
public class XiaoQiangConfig {

    @Bean
    public XiaoQiang xiaoQiang() {
        return new XiaoQiang(zhangSan());
    }

    @Bean
    public Fighter zhangSan() {
        return new ZhangSan();
    }

}
