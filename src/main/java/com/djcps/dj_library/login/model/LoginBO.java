package com.djcps.dj_library.login.model;

import javax.validation.constraints.NotBlank;

/**
 * @author zhq
 * @description 登录model类
 * @since 2018/8/9
 */
public class LoginBO {

	/**
	 * 用户名
	 */
	@NotBlank
	private String name;

	/**
	 * 密码
	 */
	@NotBlank
	private String password;

	public LoginBO(@NotBlank String name, @NotBlank String password) {
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginBO{" + "name='" + name + '\'' + ", password='" + password + '\'' + '}';
	}
}
