package com.junmeng;

import com.junmeng.strategy.impl.XiaoQiang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author james
 * @date 2018/11/18
 */
@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private XiaoQiang xiaoQiang;

    @Override
    public void run(String... args) throws Exception {
        xiaoQiang.fight();
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
