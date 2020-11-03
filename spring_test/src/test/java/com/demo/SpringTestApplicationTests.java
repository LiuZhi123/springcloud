package com.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.annotation.security.RunAs;
import javax.sql.DataSource;

@SpringBootTest(classes = SpringTestApplication.class)
@RunWith(SpringRunner.class)
class SpringTestApplicationTests {

    @Autowired
    ApplicationContext ioc;

//    @Qualifier("datasource1")
//    @Resource
//    DataSource dataSource1;
    @Test
    public void getInfo(){
        boolean b = ioc.containsBean("datasource1");
        System.out.println(b);
    }

}
