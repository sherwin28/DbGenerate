package cn.wyb.entity.model;

/** 车辆信息表; 
 * @author sherwin.wei
 * @company weiyuanbiao.cn
 * @date 2014-10-09 21:31:38
 * @version 0.0.1
 */
@EntityTableAnnotation(TableName = "T_ZC_CARINFO", IsMaxCount=true)
public class TZcCarinfoEntity implements TEntity<String> {
	/** 主键*/
    private int id; 
	/** 用户编码*/
    private int userid; 
	/** 出厂日期*/
    private String factoryYear; 
	/** 车辆类型*/
    private String carType; 
	/** 车辆品牌*/
    private String carBrand; 
	/** 车辆参数*/
    private String varb; 
	/** 车牌号码*/
    private String carNum; 
	/** 车长*/
    private String carLenth; 
	/** 车宽*/
    private String carWidth; 
	/** 车高*/
    private String carHight; 
	/** 载重量*/
    private String car_load; 
	/** 常跑起跑点*/
    private String run_start; 
	/** 常跑终点*/
    private String run_end; 
	/** 车的图片位置*/
    private String car_pic; 
	/** 状态，1休息中，2接货中，3运货中，4不运中*/
    private int state; 
	/** */
    private String createtime; 
	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
    public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
    public String getFactoryYear() {
		return factoryYear;
	}
	public void setFactoryYear(String factoryYear) {
		this.factoryYear = factoryYear;
	}
    public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
    public String getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
    public String getVarb() {
		return varb;
	}
	public void setVarb(String varb) {
		this.varb = varb;
	}
    public String getCarNum() {
		return carNum;
	}
	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}
    public String getCarLenth() {
		return carLenth;
	}
	public void setCarLenth(String carLenth) {
		this.carLenth = carLenth;
	}
    public String getCarWidth() {
		return carWidth;
	}
	public void setCarWidth(String carWidth) {
		this.carWidth = carWidth;
	}
    public String getCarHight() {
		return carHight;
	}
	public void setCarHight(String carHight) {
		this.carHight = carHight;
	}
    public String getCar_load() {
		return car_load;
	}
	public void setCar_load(String car_load) {
		this.car_load = car_load;
	}
    public String getRun_start() {
		return run_start;
	}
	public void setRun_start(String run_start) {
		this.run_start = run_start;
	}
    public String getRun_end() {
		return run_end;
	}
	public void setRun_end(String run_end) {
		this.run_end = run_end;
	}
    public String getCar_pic() {
		return car_pic;
	}
	public void setCar_pic(String car_pic) {
		this.car_pic = car_pic;
	}
    public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
    public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
}

