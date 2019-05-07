package com.djcps.dj_library.login.commons;

import com.djcps.dj_library.login.enums.LoginEnum;

/**
 * @author 有缘
 */
public class RetResponse {
    private final static String SUCCESS = "success";
    private final static String  FAILED = "failed";

    public static <T> RetResult<T> makeOKRsp() {
        return new RetResult<T>().setCode(LoginEnum.LOGIN_SUCCESS).setMsg(SUCCESS);
    }

    public static <T> RetResult<T> makeOKRsp(T data) {
        return new RetResult<T>().setCode(LoginEnum.LOGIN_SUCCESS).setMsg(SUCCESS).setData(data);
    }

    public static <T> RetResult<T> makeErrRsp(String message) {
        return new RetResult<T>().setCode(LoginEnum.LOGIN_ERROR).setMsg(message);
    }

    public static <T> RetResult<T> makeRsp(int code, String msg) {
        return new RetResult<T>().setCode(code).setMsg(msg);
    }

    public static <T> RetResult<T> makeRsp(int code, String msg, T data) {
        return new RetResult<T>().setCode(code).setMsg(msg).setData(data);
    }
}
