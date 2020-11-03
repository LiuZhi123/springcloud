//package com.demo.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//import org.springframework.jndi.JndiObjectFactoryBean;
//import org.springframework.stereotype.Component;
//
//import javax.naming.NamingException;
//import javax.sql.DataSource;
//
//@Configuration
//@PropertySource("classpath:application-test.yml")
//public class TbsDataSourceConfig {
//    @Value("${server.servlet.context-path}")
//    private String jndiName1 = "java:comp/env/jdbc/test2";
//    @Value("{server.port}")
//    private String name;
//    @Bean(name = "datasource2")
////    @ConfigurationProperties(prefix = "spring.")
//    public DataSource webDataSource(){
//        JndiObjectFactoryBean bean = new JndiObjectFactoryBean();
//        bean.setJndiName(jndiName1);
//        bean.setProxyInterface(DataSource.class);
//        bean.setLookupOnStartup(false);
//        try {
//            bean.afterPropertiesSet();
//        } catch (NamingException e) {
//            e.printStackTrace();
//        }
////        DruidDataSource druidDataSource = new DruidDataSource();
////        druidDataSource.setUrl();
//
//        return (DataSource) bean.getObject();
//    }
//
//    @Bean(name = "tbsSqlSession")
//    public SqlSessionFactory webSqlSessionFactory(@Qualifier("datasource2") DataSource dataSource) throws Exception {
//        SqlSessionFactoryBean bean =new SqlSessionFactoryBean();
//        bean.setDataSource(dataSource);
//        bean.setConfigLocation(new PathMatchingResourcePatternResolver().getResource("classpath:mybatis-config.xml"));
//        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));
//        return bean.getObject();
//    }
//    @Bean(name = "tbsSqlSessionTemplate")
//    public SqlSessionTemplate tbsSqlSessionTemplate(@Qualifier("tbsSqlSession") SqlSessionFactory sqlSessionFactory){
//        return new SqlSessionTemplate(sqlSessionFactory);
//    }
//}
