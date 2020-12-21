package com.fy.one.app;

import com.alibaba.dubbo.config.ConsumerConfig;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author jack
 */
@SpringBootApplication
@EnableDubboConfiguration
@ComponentScan(basePackages = {"com.fy.one"})
public class DubboStudyOneAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboStudyOneAppApplication.class, args);
    }

    /**
     * 消费者配置不主动监督zookeeper服务
     * 如果不加这个配置，则启动时，若reference的provider未启动就会报错
     */
    @Bean
    public ConsumerConfig consumerConfig() {
        ConsumerConfig consumerConfig = new ConsumerConfig();
        consumerConfig.setCheck(false);
        consumerConfig.setTimeout(20000);
        return consumerConfig;
    }
}
