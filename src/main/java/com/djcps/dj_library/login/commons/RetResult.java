package com.djcps.dj_library.login.commons;

import com.djcps.dj_library.login.enums.LoginEnum;

/**
 * @author 有缘
 * @param <T>
 */
public class RetResult<T> {
    public int code;

    private String msg;

    private T data;

    public RetResult<T> setCode(LoginEnum retCode) {
        this.code = retCode.getCode();
        return this;
    }

    public int getCode() {
        return code;
    }

    public RetResult<T> setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public RetResult<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }

    public RetResult<T> setData(T data) {
        this.data = data;
        return this;
    }
}
