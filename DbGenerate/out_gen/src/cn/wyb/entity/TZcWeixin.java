package cn.wyb.entity.model;

/** 微信服务号信息; 
 * @author sherwin.wei
 * @company weiyuanbiao.cn
 * @date 2014-10-09 21:31:38
 * @version 0.0.1
 */
@EntityTableAnnotation(TableName = "T_ZC_WEIXIN", IsMaxCount=true)
public class TZcWeixinEntity implements TEntity<String> {
	/** */
    private int id; 
	/** */
    private String Token; 
	/** */
    private String url; 
	/** */
    private String appid; 
	/** */
    private String secret; 
	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
    public String getToken() {
		return Token;
	}
	public void setToken(String Token) {
		this.Token = Token;
	}
    public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
    public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
    public String getSecret() {
		return secret;
	}
	public void setSecret(String secret) {
		this.secret = secret;
	}
}

