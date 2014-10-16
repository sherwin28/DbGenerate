package cn.weiyuanbiao.entity;

import java.util.List;
/**
 * 表类的实体
 * @author weiyuanbiao
 *
 */
public class TableEntity {
	private String tableSqlName;
	private String tableClassName;
	private List<FieldEntity> fields;
	private String tableNote;
	
	public String getTableSqlName() {
		return tableSqlName;
	}
	public void setTableSqlName(String tableSqlName) {
		this.tableSqlName = tableSqlName;
	}
	public String getTableClassName() {
		return tableClassName;
	}
	public void setTableClassName(String tableClassName) {
		this.tableClassName = tableClassName;
	}
	public List<FieldEntity> getFields() {
		return fields;
	}
	public void setFields(List<FieldEntity> fields) {
		this.fields = fields;
	}
	public String getTableNote() {
		return tableNote;
	}
	public void setTableNote(String tableNote) {
		this.tableNote = tableNote;
	}
	@Override
	public String toString() {
		return "TableEntity [tableSqlName=" + tableSqlName
				+ ", tableClassName=" + tableClassName + ", fields=" + fields
				+ ", tableNote=" + tableNote + "]";
	}
	


}
