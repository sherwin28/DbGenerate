package cn.wyb.entity.model;

/** 用户操作日志; 
 * @author sherwin.wei
 * @company weiyuanbiao.cn
 * @date 2014-10-09 21:31:38
 * @version 0.0.1
 */
@EntityTableAnnotation(TableName = "T_ZC_USERLOG", IsMaxCount=true)
public class TZcUserlogEntity implements TEntity<String> {
	/** */
    private int id; 
	/** 用户编码*/
    private String usercode; 
	/** 操作动作*/
    private String whatdo; 
	/** 创建时间*/
    private String createtime; 
	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
    public String getUsercode() {
		return usercode;
	}
	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}
    public String getWhatdo() {
		return whatdo;
	}
	public void setWhatdo(String whatdo) {
		this.whatdo = whatdo;
	}
    public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
}

