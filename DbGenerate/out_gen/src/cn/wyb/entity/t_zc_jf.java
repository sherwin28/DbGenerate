package cn.wyb.entity.model;

/** 积分信息表; 
 * @author sherwin.wei
 * @company weiyuanbiao.cn
 * @date 2014-10-08 00:43:20
 * @version 0.0.1
 */
@EntityTableAnnotation(TableName = "T_ZC_JF", IsMaxCount=true)
public class T_zc_jfEntity implements TEntity<String> {
	/** */
    private int id; 
	/** 用户编码*/
    private String usercode; 
	/** 车辆编码*/
    private String carcode; 
	/** 积分*/
    private int jifen; 
	/** 备注*/
    private String remark; 
	
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
    public String getCarcode() {
		return carcode;
	}
	public void setCarcode(String carcode) {
		this.carcode = carcode;
	}
    public int getJifen() {
		return jifen;
	}
	public void setJifen(int jifen) {
		this.jifen = jifen;
	}
    public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}

