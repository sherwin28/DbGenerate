package com.happy.system.entity;

import org.nutz.dao.entity.annotation.*;
/** 会员详细信息; 
 * @author sherwin.wei
 * @company com.happy
 * @date 2014-10-10 16:37:23
 * @version 0.0.1
 */
@Table("T_CUST_MEMBER_INFO")
public class MemberInfo {
	/** 会员id*/
	@Column("member_id")
    private int memberId; 
	/** 真实名字*/
	@Column("real_name")
    private String realName; 
	/** 身份证*/
	@Column("sfz")
    private String sfz; 
	/** 地址*/
	@Column("address")
    private String address; 
	/** 支付宝帐号*/
	@Column("zhifubao")
    private String zhifubao; 
	/** 当前帐号金额*/
	@Column("money")
    private String money; 
	/** 银行*/
	@Column("yinhang")
    private String yinhang; 
	/** 银行卡号*/
	@Column("yinhangka")
    private String yinhangka; 
	
    public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
    public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
    public String getSfz() {
		return sfz;
	}
	public void setSfz(String sfz) {
		this.sfz = sfz;
	}
    public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
    public String getZhifubao() {
		return zhifubao;
	}
	public void setZhifubao(String zhifubao) {
		this.zhifubao = zhifubao;
	}
    public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
    public String getYinhang() {
		return yinhang;
	}
	public void setYinhang(String yinhang) {
		this.yinhang = yinhang;
	}
    public String getYinhangka() {
		return yinhangka;
	}
	public void setYinhangka(String yinhangka) {
		this.yinhangka = yinhangka;
	}
	
	@Override
	public String toString() {
		return "MemberInfo ["+
		"memberId = " + memberId + ", "+
		"realName = " + realName + ", "+
		"sfz = " + sfz + ", "+
		"address = " + address + ", "+
		"zhifubao = " + zhifubao + ", "+
		"money = " + money + ", "+
		"yinhang = " + yinhang + ", "+
		"yinhangka = " + yinhangka + ", "+
		"]";
	}
}

