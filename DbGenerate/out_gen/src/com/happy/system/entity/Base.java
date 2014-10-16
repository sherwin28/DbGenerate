package com.happy.system.entity;

import org.nutz.dao.entity.annotation.*;
/** 
 * @author sherwin.wei
 * @company com.happy
 * @date 2014-10-10 16:37:23
 * @version 0.0.1
 */
@Table("T_COIN_BASE")
public class Base {
	/** 货币id*/
	@Column("coin_id")
    private int coinId; 
	/** 货币编码*/
	@Column("coin_code")
    private String coinCode; 
	/** 货币主*/
	@Column("coin_owner")
    private String coinOwner; 
	/** 创建时间*/
	@Column("create_time")
    private String createTime; 
	/** 是否在用*/
	@Column("is_use")
    private int isUse; 
	
    public int getCoinId() {
		return coinId;
	}
	public void setCoinId(int coinId) {
		this.coinId = coinId;
	}
    public String getCoinCode() {
		return coinCode;
	}
	public void setCoinCode(String coinCode) {
		this.coinCode = coinCode;
	}
    public String getCoinOwner() {
		return coinOwner;
	}
	public void setCoinOwner(String coinOwner) {
		this.coinOwner = coinOwner;
	}
    public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
    public int getIsUse() {
		return isUse;
	}
	public void setIsUse(int isUse) {
		this.isUse = isUse;
	}
	
	@Override
	public String toString() {
		return "Base ["+
		"coinId = " + coinId + ", "+
		"coinCode = " + coinCode + ", "+
		"coinOwner = " + coinOwner + ", "+
		"createTime = " + createTime + ", "+
		"isUse = " + isUse + ", "+
		"]";
	}
}

