package cn.weiyuanbiao.transform.Db2Java;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import cn.weiyuanbiao.entity.TableEntity;
import cn.weiyuanbiao.util.PropertiesUtils;

public class WybMain {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws IOException, SQLException {
		System.out.println("------------------------");
		GeneralHandle generalHandle = new GeneralHandle();
		TableEntity tableEntity = new TableEntity();
		String packageName = "com.happy.system.entity";
		Map<String, Object> propMap = new HashMap<String, Object>();
		propMap.put("tableEntity", tableEntity);
		propMap.put("packageName", packageName);
		String filterStr = "t_sys_|t_coin_|t_cust_";
		generalHandle.generalAll("Model.java.ftl",packageName,filterStr);
	}

}
