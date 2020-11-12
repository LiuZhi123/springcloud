package com.springboot.sso.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping("/login")
    public String login(String username,String password){
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);
        Subject subject = SecurityUtils.getSubject();
        subject.login(token);
        return "success";
    }
    @RequiresPermissions("test")
    @RequestMapping("/index")
    public String testPermission(){
        return "hello world";
    }

    @RequiresPermissions("test1")
    @RequestMapping("/name")
    public String testNoPermission(){
        return "test success";
    }

}
