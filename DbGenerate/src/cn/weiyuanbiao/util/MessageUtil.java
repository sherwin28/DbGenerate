package cn.weiyuanbiao.util;

import java.util.Properties;

/**
 * @author wenzheng
 * @date   2013-6-28
 * 
 */
public class MessageUtil {

	private static String DEFAULT_PROPERTIES_NAME;
	private static String DEFAULT_PROPERTIES;
	private static Properties properties=null;
	
	
	static 
	{
		DEFAULT_PROPERTIES_NAME = "errormessage";
		DEFAULT_PROPERTIES = (new StringBuilder(String.valueOf(DEFAULT_PROPERTIES_NAME))).append(".properties").toString();
		properties=PropertiesUtils.loadProperties(DEFAULT_PROPERTIES);
	}
	
	
	public static String getMessage(String key){
		return properties.getProperty(key);
	}
	
	
	public static String getMessage(String key,String ... args){
		String val=properties.getProperty(key) ;
		if(StringUtils.isNotEmpty(val)&&args!=null){
			for (int i = 0; i < args.length; i++) {
				val=val.replace("{"+i+"}", args[i]);
			}
		}
		return val;
	}
}

