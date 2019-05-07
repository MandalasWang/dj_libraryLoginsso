package com.djcps.dj_library.login.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 有缘
 * 代理的一个服务接口
 */
@FeignClient(name = "djauth/djauth", url = "${ssologin}")
public interface LoginClient {

    @RequestMapping(value = "applogin.do", method = RequestMethod.POST)
    String appLogin(@RequestParam(value = "username", required = true) String username,
                    @RequestParam(value = "password", required = true) String password,
                    @RequestParam(value = "appname", required = true) String appname);


    @RequestMapping(value = "getUserByToken.do", method = RequestMethod.GET)
    String getUserByToken(@RequestParam(value = "token", required = true) String token);
}
