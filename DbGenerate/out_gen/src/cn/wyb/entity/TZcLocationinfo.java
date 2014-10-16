package cn.wyb.entity.model;

/** 定位信息（做update); 
 * @author sherwin.wei
 * @company weiyuanbiao.cn
 * @date 2014-10-09 21:31:38
 * @version 0.0.1
 */
@EntityTableAnnotation(TableName = "T_ZC_LOCATIONINFO", IsMaxCount=true)
public class TZcLocationinfoEntity implements TEntity<String> {
	/** */
    private int id; 
	/** 车辆编码*/
    private String carcode; 
	/** 定位时间*/
    private String locattime; 
	/** 定位获取到的中文位置名称（标志性位置）*/
    private String location; 
	/** 经度坐标*/
    private String longitude; 
	/** 纬度坐标*/
    private String latitude; 
	/** 备注*/
    private String createTime; 
	
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
    public String getLocattime() {
		return locattime;
	}
	public void setLocattime(String locattime) {
		this.locattime = locattime;
	}
    public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
    public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
    public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
    public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
}

