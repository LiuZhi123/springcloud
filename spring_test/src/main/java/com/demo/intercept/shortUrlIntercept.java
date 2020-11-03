package com.demo.intercept;

import com.demo.entity.Url;
import com.demo.service.shortUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Component
public class shortUrlIntercept implements HandlerInterceptor {
    @Resource
    private shortUrlService shortUrlService;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        StringBuffer requestURL = request.getRequestURL();
        String[] url = requestURL.toString().split("/");
//        System.out.println("==================="+requestURL1);
//        response.sendRedirect();
        if (url[3].length()==6){
//            Url url1=shortUrlService.getByShort(url[3]);
//            response.sendRedirect(url1.getLong_url());
            return true;
        }
        else {
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
