package com.happy.system.entity;

import org.nutz.dao.entity.annotation.*;
/** 权限表; 
 * @author sherwin.wei
 * @company com.happy
 * @date 2014-10-10 16:37:23
 * @version 0.0.1
 */
@Table("T_SYS_AUTHORITY")
public class Authority {
	/** 权限id*/
	@Column("authority_id")
    private int authorityId; 
	/** 菜单id*/
	@Column("menu_id")
    private int menuId; 
	/** 角色id*/
	@Column("role_id")
    private int roleId; 
	
    public int getAuthorityId() {
		return authorityId;
	}
	public void setAuthorityId(int authorityId) {
		this.authorityId = authorityId;
	}
    public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
    public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	
	@Override
	public String toString() {
		return "Authority ["+
		"authorityId = " + authorityId + ", "+
		"menuId = " + menuId + ", "+
		"roleId = " + roleId + ", "+
		"]";
	}
}

