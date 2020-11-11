package com.springboot.sso.config;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.filter.authc.AnonymousFilter;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.DelegatingFilterProxy;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import java.util.HashMap;
import java.util.Map;
@Configuration
public class shiroConfig {
    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new DelegatingFilterProxy("shiro"));
        filterRegistrationBean.setEnabled(true);
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.setDispatcherTypes(DispatcherType.REQUEST);
        return filterRegistrationBean;
    }

    @Bean(name = "shiro")
    public ShiroFilterFactoryBean shiroFilter(){
        ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
        bean.setSecurityManager(securityManager());
        bean.setLoginUrl("/login");
        bean.setUnauthorizedUrl("/unauthor");
        Map<String, Filter> map = new HashMap<String, Filter>();
        map.put("anon",new AnonymousFilter());
        bean.setFilters(map);
        Map<String,String> chains = new HashMap<String, String>();
        chains.put("/login","anon");
        chains.put("/home","anon");
        chains.put("/test","anon");
        chains.put("/**","authc");
        bean.setFilterChainDefinitionMap(chains);
        return bean;
    }

    @Bean(name = "securityManager")
    public DefaultWebSecurityManager securityManager(){
        DefaultWebSecurityManager manager = new DefaultWebSecurityManager();
//        manager.setRealm();
        manager.setSessionManager(sessionManager());
        return manager;
    }

    @Bean(name = "sessionManager")
    public DefaultWebSessionManager sessionManager(){
        DefaultWebSessionManager manager = new DefaultWebSessionManager();
        manager.setGlobalSessionTimeout(1800000);
        manager.setDeleteInvalidSessions(true);
        manager.setSessionValidationSchedulerEnabled(true);
        manager.setSessionIdCookie(cookie());
        return manager;
    }

    @Bean("sessionCookie")
    public SimpleCookie cookie(){
        SimpleCookie simpleCookie = new SimpleCookie("webcookie");
        simpleCookie.setHttpOnly(true);
        simpleCookie.setMaxAge(-1);
        return simpleCookie;
    }

//    @Bean
//    public UserRealm
}
