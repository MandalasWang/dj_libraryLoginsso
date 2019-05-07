package com.djcps.dj_library.login.model;

/**
 * @author zhq
 * @description 获得调取oa登录结果模型类
 * @since 2018/8/13
 */
public class UserInfoBO {

	/**
	 *  图片地址
	 */
	public String userIco;

	/**
	 *  推送id
	 */
	public String pushID;

	/**
	 *  用户名
	 */
	public String userName;

	/**
	 *  token令牌
	 */
	public String token;

	/**
	 * 用户内部id
	 */
	public String uid;

	/**
	 * 用户类型（0：普通用户  1：管理员）
	 */
	private String utype;

	public String getUtype() {
		return utype;
	}

	public void setUtype(String utype) {
		this.utype = utype;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUserIco() {
		return userIco;
	}

	public void setUserIco(String userIco) {
		this.userIco = userIco;
	}

	public String getPushID() {
		return pushID;
	}

	public void setPushID(String pushID) {
		this.pushID = pushID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "UserInfoBO{" + "userIco='" + userIco + '\'' + ", pushID='" + pushID + '\''
				+ ", userName='" + userName + '\'' + ", token='" + token + '\'' + ", uid='" + uid
				+ '\'' + '}';
	}
}
