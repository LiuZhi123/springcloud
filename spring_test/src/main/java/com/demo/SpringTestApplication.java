package com.demo;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
//import com.demo.util.messageConsumer;
import org.apache.rocketmq.client.exception.MQClientException;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "com.demo.mapper")
//@ServletComponentScan(basePackages = "com.demo.filter")
//@NacosPropertySource(dataId = "example",autoRefreshed = true)
public class SpringTestApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = (ApplicationContext) SpringApplication.run(SpringTestApplication.class, args);
//        messageConsumer consumer = ctx.getBean(messageConsumer.class);
////        try {
////            consumer.setConsumer();
////        } catch (MQClientException e) {
////            e.printStackTrace();
////        }
    }

}
