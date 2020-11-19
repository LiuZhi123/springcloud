package com.springboot.sso.config;

import com.springboot.sso.util.RetryCredentialsMatcher;
import com.springboot.sso.util.myRealm;
import com.sun.deploy.security.CredentialManager;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.filter.authc.AnonymousFilter;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
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
        chains.put("/async","anon");
//        chains.put("/home","anon");
//        chains.put("/test","anon");
//        chains.put("/name","anon");
//        chains.put("/index","anon");
        chains.put("/**","authc");
        bean.setFilterChainDefinitionMap(chains);
        return bean;
    }

    @Bean(name = "securityManager")
    public DefaultWebSecurityManager securityManager(){
        DefaultWebSecurityManager manager = new DefaultWebSecurityManager();
        manager.setRealm(getRealm());
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

    @Bean("myRealm")
    @DependsOn(value = "lifecycleBeanPostProcessor")
    public myRealm getRealm(){
        myRealm realm = new myRealm();
        realm.setCredentialsMatcher(credentialsMatcher());
        return realm;
    }

    @Bean
    @DependsOn(value = "lifecycleBeanPostProcessor")
    public DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator(){
        DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
        advisorAutoProxyCreator.setProxyTargetClass(true);
        return advisorAutoProxyCreator;
    }

    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(){
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager());
        return authorizationAttributeSourceAdvisor;
    }

    @Bean(name = "credentialsMatcher")
    public CredentialsMatcher credentialsMatcher(){
        return new RetryCredentialsMatcher();
    }

    @Bean(name = "lifecycleBeanPostProcessor")
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor(){
        return new LifecycleBeanPostProcessor();
    }
}
