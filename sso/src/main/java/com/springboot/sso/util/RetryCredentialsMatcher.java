package com.springboot.sso.util;

import org.apache.shiro.authc.*;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;

public class RetryCredentialsMatcher extends HashedCredentialsMatcher {
    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
        String username = (String) token.getPrincipal();
        String password = new String((char[])token.getCredentials()) ;
//        if (username != "liuzhi"){
//            return false;
//        }
//        else if (username =="liuzhi" && password!="123"){
//            return false;
//        }
        return true;
    }
}
