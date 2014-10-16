package cn.wyb.entity.model;

/** 离线留言; 
 * @author sherwin.wei
 * @company weiyuanbiao.cn
 * @date 2014-10-09 21:31:38
 * @version 0.0.1
 */
@EntityTableAnnotation(TableName = "T_ZC_BBS", IsMaxCount=true)
public class TZcBbsEntity implements TEntity<String> {
	/** */
    private int id; 
	/** 聊天人(聊天发起人)*/
    private String usercode; 
	/** 聊天对象*/
    private String tousercode; 
	/** */
    private String content; 
	/** */
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
    public String getTousercode() {
		return tousercode;
	}
	public void setTousercode(String tousercode) {
		this.tousercode = tousercode;
	}
    public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
    public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
}

