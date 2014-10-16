package cn.weiyuanbiao.util;

import org.apache.commons.dbcp.BasicDataSource;  
import org.apache.commons.dbcp.BasicDataSourceFactory;  
  


import cn.weiyuanbiao.util.PropertiesUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.SQLException;  
import java.sql.Connection;  
import java.util.Properties;  
  
public class ConnectionSourceUtils {  
    private static BasicDataSource dataSource = null;  
  
    public ConnectionSourceUtils() {  
    }  
  
    public static void init() {  
  
        if (dataSource != null) {  
            try {  
                dataSource.close();  
            } catch (Exception e) {  
                //  
            }  
            dataSource = null;  
        }  
  
        try {  
            Properties p = PropertiesUtils.loadProperties();  
//            Properties p = new Properties();  
//            String file="conf/dbcp.properties";
//			InputStream inputStream =new FileInputStream(new File(file));
//			p.load(inputStream);
//			inputStream.close();
            dataSource = (BasicDataSource) BasicDataSourceFactory.createDataSource(p);  
  
        } catch (Exception e) {  
            //  
        }  
    }  
  
  
    public static synchronized Connection getConnection() throws  SQLException {  
        if (dataSource == null) {  
            init();  
        }  
        Connection conn = null;  
        if (dataSource != null) {  
            conn = dataSource.getConnection();  
        }  
        return conn;  
    }  
    
    public static void main(String[] args) {
    	try {
			new ConnectionSourceUtils().getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}  
