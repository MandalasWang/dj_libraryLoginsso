package com.djcps.dj_library.login.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("已经进入拦截器..........");
        //return false表示不进入controller
        //return true表示进入controller
        if(request.getCookies()==null || request.getParameter("username").equals("")){
            return false;
        }else {
            return true;
        }
        // 通过请求直接获取request中包含的所有的cookie
       // Cookie[] cookies = request.getCookies();
        // 遍历所有的cookie,然后拿cookie的key值来获取token值与redis缓存里面的token相比较
        /*if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getValue().equals()) {

                }
            }
        }*/

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
