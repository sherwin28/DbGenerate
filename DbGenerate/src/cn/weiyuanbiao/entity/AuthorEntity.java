package cn.weiyuanbiao.entity;


/**
 * @author sherwin.wei
 * 2014年8月21日
 * ver 1.0
 */
public class AuthorEntity {
	private String author;
	private String company;
	private String createTime;
	private String version;
	
	public AuthorEntity() {
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
}
