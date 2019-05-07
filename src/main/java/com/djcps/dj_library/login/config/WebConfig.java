package com.djcps.dj_library.login.config;

import com.djcps.dj_library.login.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author 有缘
 */
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        // 需要拦截的路径
        String[] addPathPatterns = {
                "/**"
        };
        //不需要拦截的路径
        String[] excludePathPatterns = {
                "/vpi/v/user/userlogin/**"
        };
        //addPathPatterns()添加拦截路径
        //excludePathPatterns() 添加不拦截的路径
        //添加注册登录拦截器
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns(addPathPatterns).excludePathPatterns(excludePathPatterns);

        //如果有多个拦截器可以注册多个...


    }


}
