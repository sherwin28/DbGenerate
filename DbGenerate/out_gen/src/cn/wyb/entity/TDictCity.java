package cn.wyb.entity.model;

/** 
 * @author sherwin.wei
 * @company weiyuanbiao.cn
 * @date 2014-10-09 21:31:38
 * @version 0.0.1
 */
@EntityTableAnnotation(TableName = "T_DICT_CITY", IsMaxCount=true)
public class TDictCityEntity implements TEntity<String> {
	/** */
    private int ID; 
	/** */
    private String Name; 
	/** */
    private String Code; 
	/** */
    private int ProvinceID; 
	
    public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
    public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
    public String getCode() {
		return Code;
	}
	public void setCode(String Code) {
		this.Code = Code;
	}
    public int getProvinceID() {
		return ProvinceID;
	}
	public void setProvinceID(int ProvinceID) {
		this.ProvinceID = ProvinceID;
	}
}

