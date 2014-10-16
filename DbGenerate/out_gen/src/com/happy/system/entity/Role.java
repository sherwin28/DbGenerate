package com.happy.system.entity;

import org.nutz.dao.entity.annotation.*;
/** 角色; 
 * @author sherwin.wei
 * @company com.happy
 * @date 2014-10-10 16:37:23
 * @version 0.0.1
 */
@Table("T_SYS_ROLE")
public class Role {
	/** 角色id*/
	@Column("role_id")
    private int roleId; 
	/** 角色*/
	@Column("role_name")
    private String roleName; 
	/** 是否在用*/
	@Column("is_use")
    private int isUse; 
	/** 备注*/
	@Column("remark")
    private String remark; 
	
    public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
    public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
    public int getIsUse() {
		return isUse;
	}
	public void setIsUse(int isUse) {
		this.isUse = isUse;
	}
    public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	@Override
	public String toString() {
		return "Role ["+
		"roleId = " + roleId + ", "+
		"roleName = " + roleName + ", "+
		"isUse = " + isUse + ", "+
		"remark = " + remark + ", "+
		"]";
	}
}

