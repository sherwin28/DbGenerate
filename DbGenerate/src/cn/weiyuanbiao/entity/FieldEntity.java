package cn.weiyuanbiao.entity;
/**
 * 字段实体
 * @author weiyuanbiao
 *
 */
public class FieldEntity {
	private String fieldClassName;
	private String fieldClassType;
	
	private String fieldSqlName;
	private String fieldSqlType;
	private String fieldSqlLength;
	
	private String fieldNote;

	public String getFieldClassName() {
		return fieldClassName;
	}

	public void setFieldClassName(String fieldClassName) {
		this.fieldClassName = fieldClassName;
	}

	public String getFieldClassType() {
		return fieldClassType;
	}

	public void setFieldClassType(String fieldClassType) {
		this.fieldClassType = fieldClassType;
	}

	public String getFieldSqlName() {
		return fieldSqlName;
	}

	public void setFieldSqlName(String fieldSqlName) {
		this.fieldSqlName = fieldSqlName;
	}

	public String getFieldSqlType() {
		return fieldSqlType;
	}

	public void setFieldSqlType(String fieldSqlType) {
		this.fieldSqlType = fieldSqlType;
	}

	public String getFieldSqlLength() {
		return fieldSqlLength;
	}

	public void setFieldSqlLength(String fieldSqlLength) {
		this.fieldSqlLength = fieldSqlLength;
	}

	public String getFieldNote() {
		return fieldNote;
	}

	public void setFieldNote(String fieldNote) {
		this.fieldNote = fieldNote;
	}

	@Override
	public String toString() {
		return "FieldEntity [fieldClassName=" + fieldClassName
				+ ", fieldClassType=" + fieldClassType + ", fieldSqlName="
				+ fieldSqlName + ", fieldSqlType=" + fieldSqlType
				+ ", fieldSqlLength=" + fieldSqlLength + ", fieldNote="
				+ fieldNote + "]";
	}
	
	
}
