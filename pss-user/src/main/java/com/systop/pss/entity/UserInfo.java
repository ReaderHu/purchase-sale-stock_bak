package com.systop.pss.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 用户信息
 * </p>
 *
 * @author Wang
 * @since 2019-11-26
 */
public class UserInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 用户ID
	 */
	private String uuId;

	/**
	 * 用户名称
	 */
	private String userName;

	/**
	 * 年龄
	 */
	private Integer userAge;

	/**
	 * 手机
	 */
	private String telPhone;

	/**
	 * 部门
	 */
	private String department;

	/**
	 * 工龄
	 */
	private Integer workAge;

	/**
	 * 是否是管理员
	 */
	private String adminFlag;

	/**
	 * 入职时间
	 */
	private LocalDateTime entryTime;

	/**
	 * 离职flag
	 */
	private String dimissionFlag;

	public String getUuId() {
		return uuId;
	}

	public void setUuId(String uuId) {
		this.uuId = uuId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getUserAge() {
		return userAge;
	}

	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}

	public String getTelPhone() {
		return telPhone;
	}

	public void setTelPhone(String telPhone) {
		this.telPhone = telPhone;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Integer getWorkAge() {
		return workAge;
	}

	public void setWorkAge(Integer workAge) {
		this.workAge = workAge;
	}

	public String getAdminFlag() {
		return adminFlag;
	}

	public void setAdminFlag(String adminFlag) {
		this.adminFlag = adminFlag;
	}

	public LocalDateTime getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(LocalDateTime entryTime) {
		this.entryTime = entryTime;
	}

	public String getDimissionFlag() {
		return dimissionFlag;
	}

	public void setDimissionFlag(String dimissionFlag) {
		this.dimissionFlag = dimissionFlag;
	}
}
