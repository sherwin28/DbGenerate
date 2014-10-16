package cn.wyb.entity.model;

/** 
 * @author sherwin.wei
 * @company weiyuanbiao.cn
 * @date 2014-10-09 21:31:38
 * @version 0.0.1
 */
@EntityTableAnnotation(TableName = "T_ZC_WECHAT_MENU", IsMaxCount=true)
public class TZcWechatMenuEntity implements TEntity<String> {
	/** 主键*/
    private int id; 
	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}

