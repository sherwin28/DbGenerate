package cn.wyb.entity.model;

/** 汽车图片; 
 * @author sherwin.wei
 * @company weiyuanbiao.cn
 * @date 2014-10-09 21:31:38
 * @version 0.0.1
 */
@EntityTableAnnotation(TableName = "T_ZC_CARPIC", IsMaxCount=true)
public class TZcCarpicEntity implements TEntity<String> {
	/** 主键*/
    private int id; 
	/** 车辆编号*/
    private int carid; 
	/** 车辆照片*/
    private String picName; 
	/** */
    private String createtime; 
	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
    public int getCarid() {
		return carid;
	}
	public void setCarid(int carid) {
		this.carid = carid;
	}
    public String getPicName() {
		return picName;
	}
	public void setPicName(String picName) {
		this.picName = picName;
	}
    public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
}

