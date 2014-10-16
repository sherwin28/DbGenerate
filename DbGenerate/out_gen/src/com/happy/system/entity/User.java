package com.happy.system.entity;

import org.nutz.dao.entity.annotation.*;
/** 用户表; 
 * @author sherwin.wei
 * @company com.happy
 * @date 2014-10-10 16:37:23
 * @version 0.0.1
 */
@Table("T_SYS_USER")
public class User {
	/** 用户id*/
	@Column("user_id")
    private int userId; 
	/** 用户名*/
	@Column("user_name")
    private String userName; 
	/** 登录名*/
	@Column("login_name")
    private String loginName; 
	/** 密码*/
	@Column("password")
    private String password; 
	/** 邮件*/
	@Column("email")
    private String email; 
	/** 手机号码*/
	@Column("phone")
    private String phone; 
	/** 是否在用*/
	@Column("is_use")
    private int isUse; 
	/** 角色编号*/
	@Column("role_id")
    private int roleId; 
	
    public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
    public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
    public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
    public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
    public int getIsUse() {
		return isUse;
	}
	public void setIsUse(int isUse) {
		this.isUse = isUse;
	}
    public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	
	@Override
	public String toString() {
		return "User ["+
		"userId = " + userId + ", "+
		"userName = " + userName + ", "+
		"loginName = " + loginName + ", "+
		"password = " + password + ", "+
		"email = " + email + ", "+
		"phone = " + phone + ", "+
		"isUse = " + isUse + ", "+
		"roleId = " + roleId + ", "+
		"]";
	}
}

