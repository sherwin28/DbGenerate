package cn.wyb.entity.model;

/** 找车字典表; 
 * @author sherwin.wei
 * @company weiyuanbiao.cn
 * @date 2014-10-09 21:31:38
 * @version 0.0.1
 */
@EntityTableAnnotation(TableName = "T_ZC_DICT", IsMaxCount=true)
public class TZcDictEntity implements TEntity<String> {
	/** 主键*/
    private int id; 
	/** 编码*/
    private String code; 
	/** 父id*/
    private String parentcode; 
	/** 用途*/
    private String name; 
	/** 字典类型*/
    private String typecode; 
	/** 备注*/
    private String remark; 
	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
    public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
    public String getParentcode() {
		return parentcode;
	}
	public void setParentcode(String parentcode) {
		this.parentcode = parentcode;
	}
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    public String getTypecode() {
		return typecode;
	}
	public void setTypecode(String typecode) {
		this.typecode = typecode;
	}
    public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}

