//package com.demo.config;
//
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Value;
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
//
//@Configuration
//@PropertySource("classpath:application-db.yml")
//public class WebDataSourceConfig {
////    @Value("${spring.datasource.jndi-name}")
//    private String jndiName = "java:comp/env/jdbc/test1";
//    @Bean(name = "datasource1")
//    public DataSource webDataSource(){
//        JndiObjectFactoryBean bean = new JndiObjectFactoryBean();
//        bean.setJndiName(jndiName);
//        bean.setProxyInterface(DataSource.class);
//        bean.setLookupOnStartup(false);
//        try {
//            bean.afterPropertiesSet();
//        } catch (NamingException e) {
//            e.printStackTrace();
//        }
//        return (DataSource) bean.getObject();
//    }
//
//    @Bean(name = "webSqlSession")
//    public SqlSessionFactory webSqlSessionFactory(@Qualifier("datasource1") DataSource dataSource) throws Exception {
//        SqlSessionFactoryBean bean =new SqlSessionFactoryBean();
//        bean.setDataSource(dataSource);
//        bean.setConfigLocation(new PathMatchingResourcePatternResolver().getResource("classpath:mybatis-config.xml"));
//        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));
//        return bean.getObject();
//    }
//
//    @Bean(name = "webSqlSessionTemplate")
//    public SqlSessionTemplate webSqlSessionTemplate(@Qualifier("webSqlSession") SqlSessionFactory sqlSessionFactory){
//        return new SqlSessionTemplate(sqlSessionFactory);
//    }
//}
