package com.djcps.dj_library.login.controller;

import com.djcps.dj_library.login.commons.RetResult;
import com.djcps.dj_library.login.model.LoginBO;
import com.djcps.dj_library.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 */
@RestController
@RequestMapping(value = "vpi/v/user")
public class LoginController {
    @Autowired
    private UserService userService;

    /**
     * 做的一个统一登录使用feign调用门户服务
     * @param username
     * @param password
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/userlogin")
    public RetResult<Object> UserLogin(@RequestParam("username") String username, @RequestParam("password")String password
            , HttpServletRequest request, HttpServletResponse response){
        LoginBO loginBO = new LoginBO(username,password);
        RetResult<Object> httpResult= userService.userLogin(loginBO,request,response);
        return  httpResult;
    }
}
