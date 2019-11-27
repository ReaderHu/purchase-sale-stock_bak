package com.systop.pss.entity;

import java.io.Serializable;

/**
 * <p>
 * 用户密码
 * </p>
 *
 * @author Wang
 * @since 2019-11-26
 */
public class UserPassword implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	private Integer pwdId;

	/**
	 * 用户ID
	 */
	private String uuId;

	/**
	 * 密码
	 */
	private String pwd;

	public Integer getPwdId() {
		return pwdId;
	}

	public void setPwdId(Integer pwdId) {
		this.pwdId = pwdId;
	}

	public String getUuId() {
		return uuId;
	}

	public void setUuId(String uuId) {
		this.uuId = uuId;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
