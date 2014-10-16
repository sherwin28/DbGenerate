package cn.wyb.entity.model;

/** 评分信息表; 
 * @author sherwin.wei
 * @company weiyuanbiao.cn
 * @date 2014-10-09 21:31:38
 * @version 0.0.1
 */
@EntityTableAnnotation(TableName = "T_ZC_GRADEINFO", IsMaxCount=true)
public class TZcGradeinfoEntity implements TEntity<String> {
	/** */
    private int id; 
	/** 评分人，关联到usercode*/
    private int pingfenren; 
	/** 被评分人,关联到usercode*/
    private int carid; 
	/** 评价说明*/
    private String pingjia; 
	/** 评价等级(1-5)*/
    private int pingjiadengji; 
	/** */
    private String createtime; 
	/** 备注*/
    private String remark; 
	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
    public int getPingfenren() {
		return pingfenren;
	}
	public void setPingfenren(int pingfenren) {
		this.pingfenren = pingfenren;
	}
    public int getCarid() {
		return carid;
	}
	public void setCarid(int carid) {
		this.carid = carid;
	}
    public String getPingjia() {
		return pingjia;
	}
	public void setPingjia(String pingjia) {
		this.pingjia = pingjia;
	}
    public int getPingjiadengji() {
		return pingjiadengji;
	}
	public void setPingjiadengji(int pingjiadengji) {
		this.pingjiadengji = pingjiadengji;
	}
    public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
    public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}

