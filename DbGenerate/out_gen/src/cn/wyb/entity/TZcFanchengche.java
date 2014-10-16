package cn.wyb.entity.model;

/** 返程车; 
 * @author sherwin.wei
 * @company weiyuanbiao.cn
 * @date 2014-10-09 21:31:38
 * @version 0.0.1
 */
@EntityTableAnnotation(TableName = "T_ZC_FANCHENGCHE", IsMaxCount=true)
public class TZcFanchengcheEntity implements TEntity<String> {
	/** 主键*/
    private int id; 
	/** 车辆编号*/
    private int carId; 
	/** 返程开始地*/
    private String back_start; 
	/** 返程目的地*/
    private String back_end; 
	/** 返程时间*/
    private String back_time; 
	/** 创建时间*/
    private String createtime; 
	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
    public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
    public String getBack_start() {
		return back_start;
	}
	public void setBack_start(String back_start) {
		this.back_start = back_start;
	}
    public String getBack_end() {
		return back_end;
	}
	public void setBack_end(String back_end) {
		this.back_end = back_end;
	}
    public String getBack_time() {
		return back_time;
	}
	public void setBack_time(String back_time) {
		this.back_time = back_time;
	}
    public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
}

