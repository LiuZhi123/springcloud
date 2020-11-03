//package com.demo.config;
//
//import com.xxl.job.core.executor.impl.XxlJobSpringExecutor;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//
//@Configuration
//public class xxlJobConfig {
//    @Value("${xxl.job.admin.address}")
//    String adminAddress;
//    @Value("${xxl.job.executor.appname}")
//    String appName;
//    @Value("${xxl.job.executor.ip}")
//    String ip;
//    @Value("${xxl.job.executor.port}")
//    int port;
//    @Value("${xxl.job.accessToken}")
//    String accessToken;
//    @Value("${xxl.job.executor.logpath}")
//    String logpath;
//    @Value("${xxl.job.executor.logretentiondays}")
//    int logretentiondays;
//    @Bean(initMethod = "start")
//    public XxlJobSpringExecutor executor(){
//        XxlJobSpringExecutor xxlJobSpringExecutor = new XxlJobSpringExecutor();
//        xxlJobSpringExecutor.setAdminAddresses(adminAddress);
//        xxlJobSpringExecutor.setLogPath(logpath);
//        xxlJobSpringExecutor.setAccessToken(accessToken);
//        xxlJobSpringExecutor.setIp(ip);
//        xxlJobSpringExecutor.setPort(port);
//        xxlJobSpringExecutor.setLogRetentionDays(logretentiondays);
//        xxlJobSpringExecutor.setAppname(appName);
//        return xxlJobSpringExecutor;
//    }
//}
