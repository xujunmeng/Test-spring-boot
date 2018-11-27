//package com.junmeng.config;
//
//import com.junmeng.strategy.Fighter;
//import com.junmeng.strategy.impl.LiSi;
//import com.junmeng.strategy.impl.XiaoQiang;
//import org.springframework.boot.autoconfigure.AutoConfigureBefore;
//import org.springframework.boot.autoconfigure.AutoConfigureOrder;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @author james
// * @date 2018/11/20
// */
//@Configuration
//@ConditionalOnClass(LiSi.class)
//public class XiaoQiangConfig2 {
//
//    @Bean
//    public XiaoQiang xiaoQiang() {
//        return new XiaoQiang(liSi());
//    }
//
//    @Bean
//    public Fighter liSi() {
//        return new LiSi();
//    }
//
//}
