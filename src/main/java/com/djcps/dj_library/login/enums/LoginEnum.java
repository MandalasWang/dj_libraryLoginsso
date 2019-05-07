package com.djcps.dj_library.login.enums;

/**
 * @author zhq
 * @description 登录模块失败枚举
 * @since 2018/8/15
 */
public enum LoginEnum  {

    LOGIN_SUCCESS(200,"登录成功！"),
    /**
     * 登录失败
     */
    LOGIN_ERROR(001,"帐号密码错误"),
    /**
     * 需要登录或已过期
     */
    NEEDLOGIN_ERROR(002,"需要登录或已过期"),
    /**
     * cookie不存在
     */
    NOCOOKIE_ERROR(003,"COOKIE不存在"),
    /**
     * redis中的用户信息已经被删除
     */
    NOUSERINFO_ERROR(004,"用户信息已经被删除");

    LoginEnum(int code, String msg){
        this.code = code;
        this.msg = msg;
    }

    private int code;

    private String msg;

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    public String getMsg() {
        return msg;
    }
}
