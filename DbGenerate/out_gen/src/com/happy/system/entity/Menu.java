package com.happy.system.entity;

import org.nutz.dao.entity.annotation.*;
/** 菜单表; 
 * @author sherwin.wei
 * @company com.happy
 * @date 2014-10-10 16:37:23
 * @version 0.0.1
 */
@Table("T_SYS_MENU")
public class Menu {
	/** 菜单id*/
	@Column("menu_id")
    private int menuId; 
	/** 地址*/
	@Column("menu_url")
    private String menuUrl; 
	/** 菜单*/
	@Column("menu_name")
    private String menuName; 
	/** 备注*/
	@Column("remark")
    private String remark; 
	
    public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
    public String getMenuUrl() {
		return menuUrl;
	}
	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}
    public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
    public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	@Override
	public String toString() {
		return "Menu ["+
		"menuId = " + menuId + ", "+
		"menuUrl = " + menuUrl + ", "+
		"menuName = " + menuName + ", "+
		"remark = " + remark + ", "+
		"]";
	}
}

