package cn.wyb.entity.model;

/** 城镇; 
 * @author sherwin.wei
 * @company weiyuanbiao.cn
 * @date 2014-10-08 00:43:20
 * @version 0.0.1
 */
@EntityTableAnnotation(TableName = "T_DICT_VILLAGE", IsMaxCount=true)
public class T_dict_villageEntity implements TEntity<String> {
	/** */
    private int ID; 
	/** */
    private String Name; 
	/** */
    private String Code; 
	/** */
    private int TownID; 
	
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
    public int getTownID() {
		return TownID;
	}
	public void setTownID(int TownID) {
		this.TownID = TownID;
	}
}

