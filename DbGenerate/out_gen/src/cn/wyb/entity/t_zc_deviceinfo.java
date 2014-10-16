package cn.wyb.entity.model;

/** 设备信息表; 
 * @author sherwin.wei
 * @company weiyuanbiao.cn
 * @date 2014-10-08 00:43:20
 * @version 0.0.1
 */
@EntityTableAnnotation(TableName = "T_ZC_DEVICEINFO", IsMaxCount=true)
public class T_zc_deviceinfoEntity implements TEntity<String> {
	/** */
    private int id; 
	/** */
    private String devicecode; 
	/** 是否自动推送消息*/
    private int ispush; 
	/** 是否自动更新*/
    private int isupdate; 
	/** 是否自动定时定位*/
    private int islocat; 
	/** 自动定位频率，结合单位使用*/
    private int locateHZ; 
	/** 1.分钟，2为小时，3.为天*/
    private int locatUnit; 
	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
    public String getDevicecode() {
		return devicecode;
	}
	public void setDevicecode(String devicecode) {
		this.devicecode = devicecode;
	}
    public int getIspush() {
		return ispush;
	}
	public void setIspush(int ispush) {
		this.ispush = ispush;
	}
    public int getIsupdate() {
		return isupdate;
	}
	public void setIsupdate(int isupdate) {
		this.isupdate = isupdate;
	}
    public int getIslocat() {
		return islocat;
	}
	public void setIslocat(int islocat) {
		this.islocat = islocat;
	}
    public int getLocateHZ() {
		return locateHZ;
	}
	public void setLocateHZ(int locateHZ) {
		this.locateHZ = locateHZ;
	}
    public int getLocatUnit() {
		return locatUnit;
	}
	public void setLocatUnit(int locatUnit) {
		this.locatUnit = locatUnit;
	}
}

