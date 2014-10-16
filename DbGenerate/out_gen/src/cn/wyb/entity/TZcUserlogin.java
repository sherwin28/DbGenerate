package cn.wyb.entity.model;

/** 用户登录信息表; 
 * @author sherwin.wei
 * @company weiyuanbiao.cn
 * @date 2014-10-09 21:31:38
 * @version 0.0.1
 */
@EntityTableAnnotation(TableName = "T_ZC_USERLOGIN", IsMaxCount=true)
public class TZcUserloginEntity implements TEntity<String> {
	/** 用户编码*/
    private int id; 
	/** 用户名*/
    private String username; 
	/** 手机号码*/
    private String phone; 
	/** 邮箱*/
    private String email; 
	/** 密码*/
    private String password; 
	/** 驾驶证*/
    private String jsz; 
	/** 身份证*/
    private String sfz; 
	/** 性别*/
    private int sex; 
	/** */
    private String realname; 
	/** 类型，1个体车主，2企业车主，3货主*/
    private int type; 
	/** 状态，默认0，没有认证，1为已经认证*/
    private int state; 
	/** 用户头像*/
    private String userpic; 
	/** 注册时间*/
    private String regtime; 
	/** 最后一次登录时间*/
    private String lastlogin; 
	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
    public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
    public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
    public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    public String getJsz() {
		return jsz;
	}
	public void setJsz(String jsz) {
		this.jsz = jsz;
	}
    public String getSfz() {
		return sfz;
	}
	public void setSfz(String sfz) {
		this.sfz = sfz;
	}
    public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
    public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
    public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
    public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
    public String getUserpic() {
		return userpic;
	}
	public void setUserpic(String userpic) {
		this.userpic = userpic;
	}
    public String getRegtime() {
		return regtime;
	}
	public void setRegtime(String regtime) {
		this.regtime = regtime;
	}
    public String getLastlogin() {
		return lastlogin;
	}
	public void setLastlogin(String lastlogin) {
		this.lastlogin = lastlogin;
	}
}

