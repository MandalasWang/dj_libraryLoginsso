package com.djcps.dj_library.login.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import com.djcps.dj_library.login.commons.RetResponse;
import com.djcps.dj_library.login.commons.RetResult;
import com.djcps.dj_library.login.model.LoginBO;
import com.djcps.dj_library.login.model.UserInfoBO;
import com.djcps.dj_library.login.service.LoginClient;
import com.djcps.dj_library.login.service.UserService;
import com.djcps.dj_library.login.utils.CookiesUtil;

import com.djcps.log.entity.UserModel;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * userservice调用的djcps的用户服务登录接口
 */
@Service
public class UserServiceimpl implements UserService {
    @Autowired
    private LoginClient loginClient;

    private Gson gson = new Gson();

    @Override
    public RetResult<Object> userLogin(LoginBO loginBO, HttpServletRequest request, HttpServletResponse response) {
        String str = loginClient.appLogin(loginBO.getName(), loginBO.getPassword(), "DJOA");
       com.djcps.dj_library.login.httpclient.HttpResult result =  gson.fromJson(str, com.djcps.dj_library.login.httpclient.HttpResult.class);
        if (result.isSuccess()) {
            String str1 = JSON.toJSONString(result.getData());
            //获取token
            JSONObject token = JSON.parseObject(str1);
            //根据token拿取用户信息
            String tokenUser = loginClient.getUserByToken(token.getString("token"));
            JSONObject jsonObject = JSON.parseObject(tokenUser).getJSONObject("data")
                    .getJSONObject("user");
            jsonObject.put("ufdepartment_id", jsonObject.get("ufdepartmentId"));
            UserModel javaObject = jsonObject.toJavaObject(UserModel.class);

            jsonObject.put("userIco", jsonObject.get("uimage"));
            jsonObject.put("uid", jsonObject.get("id"));
            jsonObject.put("userName", jsonObject.get("uname"));

            UserInfoBO user = JSON.parseObject(jsonObject.toString(), UserInfoBO.class);
            user.setToken(token.getString("token"));
            CookiesUtil.setCookie(response, "token", user.getToken(), 28800);
            request.getSession().setAttribute("user",javaObject);
            return RetResponse.makeOKRsp(user);
        }
        return RetResponse.makeErrRsp("登录失败!");
    }



}
