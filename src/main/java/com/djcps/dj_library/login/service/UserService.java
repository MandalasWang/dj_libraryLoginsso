package com.djcps.dj_library.login.service;

import com.djcps.dj_library.login.commons.RetResult;
import com.djcps.dj_library.login.model.LoginBO;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface UserService {
    RetResult<Object> userLogin(LoginBO loginBO, HttpServletRequest request, HttpServletResponse response);
}
