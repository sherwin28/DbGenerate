package cn.weiyuanbiao.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/****
 * 属性文件操作
 * @version 1.0
 * @author wenz
 *  2012-02-10 16:01
 */
public class PropertiesUtils
{

	private static String DEFAULT_PROPERTIES_NAME;
	private static String DEFAULT_PROPERTIES;
	private static Properties properties=null;

	public PropertiesUtils()
	{
	}

	public static Properties loadProperties(){
		return loadProperties(DEFAULT_PROPERTIES);
	}
	static Properties loadProperties(String fileName)
	{
		if (fileName.indexOf(".properties") >= 0)
		{
			Properties properties=new Properties();
			setProperties(properties, fileName);
			return properties;
		}
		return null;
	}

	public static String getVal(String key)
	{
		String val = null;
		try {
			if(null==properties)properties=loadProperties(DEFAULT_PROPERTIES);
			if(null!=properties)val = properties.getProperty(key);
		} catch (Exception e) {
			System.out.println(e);
		}
		return val;
	}

	public static String getVal(String fileName, String key)
	{
		String val = null;
		try {
			Properties properties=loadProperties(fileName);
			if(null!=properties)val = properties.getProperty(key);
		} catch (Exception e) {
			System.out.println(e);
		}
		return val;
	}



	private static void setProperties(Properties properties, String fileName)
	{
		try
		{
//			String file=Application.get().getWebInfPath()+"classes/"+fileName;
			String file="conf/"+fileName;
			InputStream inputStream =new FileInputStream(new File(file));
			properties.load(inputStream);
			inputStream.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	static 
	{
		DEFAULT_PROPERTIES_NAME = "sysProps";
		DEFAULT_PROPERTIES = (new StringBuilder(String.valueOf(DEFAULT_PROPERTIES_NAME))).append(".properties").toString();
		loadProperties(DEFAULT_PROPERTIES);
	}
	
	
}
