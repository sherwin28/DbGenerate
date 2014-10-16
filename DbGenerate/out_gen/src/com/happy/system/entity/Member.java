package com.happy.system.entity;

import org.nutz.dao.entity.annotation.*;
/** 
 * @author sherwin.wei
 * @company com.happy
 * @date 2014-10-10 16:37:23
 * @version 0.0.1
 */
@Table("T_CUST_MEMBER")
public class Member {
	/** 会员id*/
	@Column("member_id")
    private int memberId; 
	/** 会员名*/
	@Column("member_name")
    private String memberName; 
	/** 手机号*/
	@Column("phone")
    private String phone; 
	/** 邮箱*/
	@Column("email")
    private String email; 
	/** 登录名*/
	@Column("login_name")
    private String loginName; 
	/** 是否在用*/
	@Column("is_use")
    private int isUse; 
	/** 上次登录的时间*/
	@Column("last_login_time")
    private String lastLoginTime; 
	/** 上次登录的ip*/
	@Column("last_login_ip")
    private String lastLoginIp; 
	/** 注册时间*/
	@Column("reg_time")
    private String regTime; 
	/** 备注*/
	@Column("remark")
    private String remark; 
	
    public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
    public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
    public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
    public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
    public int getIsUse() {
		return isUse;
	}
	public void setIsUse(int isUse) {
		this.isUse = isUse;
	}
    public String getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
    public String getLastLoginIp() {
		return lastLoginIp;
	}
	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}
    public String getRegTime() {
		return regTime;
	}
	public void setRegTime(String regTime) {
		this.regTime = regTime;
	}
    public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	@Override
	public String toString() {
		return "Member ["+
		"memberId = " + memberId + ", "+
		"memberName = " + memberName + ", "+
		"phone = " + phone + ", "+
		"email = " + email + ", "+
		"loginName = " + loginName + ", "+
		"isUse = " + isUse + ", "+
		"lastLoginTime = " + lastLoginTime + ", "+
		"lastLoginIp = " + lastLoginIp + ", "+
		"regTime = " + regTime + ", "+
		"remark = " + remark + ", "+
		"]";
	}
}

