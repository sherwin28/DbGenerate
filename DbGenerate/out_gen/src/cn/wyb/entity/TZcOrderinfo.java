package cn.wyb.entity.model;

/** 订单信息表; 
 * @author sherwin.wei
 * @company weiyuanbiao.cn
 * @date 2014-10-09 21:31:38
 * @version 0.0.1
 */
@EntityTableAnnotation(TableName = "T_ZC_ORDERINFO", IsMaxCount=true)
public class TZcOrderinfoEntity implements TEntity<String> {
	/** */
    private int id; 
	/** 车辆编码*/
    private String carcode; 
	/** 用户编码*/
    private String usercode; 
	/** 开始地方*/
    private String startplace; 
	/** 结束地方*/
    private String endplace; 
	/** 开始时间*/
    private String startTime; 
	/** 结束时间*/
    private String endtime; 
	/** 下单时间*/
    private String orderTime; 
	/** 创建时间*/
    private String createtime; 
	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
    public String getCarcode() {
		return carcode;
	}
	public void setCarcode(String carcode) {
		this.carcode = carcode;
	}
    public String getUsercode() {
		return usercode;
	}
	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}
    public String getStartplace() {
		return startplace;
	}
	public void setStartplace(String startplace) {
		this.startplace = startplace;
	}
    public String getEndplace() {
		return endplace;
	}
	public void setEndplace(String endplace) {
		this.endplace = endplace;
	}
    public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
    public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
    public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
    public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
}

