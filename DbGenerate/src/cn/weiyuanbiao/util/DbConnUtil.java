package cn.weiyuanbiao.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cn.weiyuanbiao.entity.FieldEntity;
import cn.weiyuanbiao.entity.TableEntity;

public class DbConnUtil {
	private static Connection conn = null;
	private static ConnectionSourceUtils connSource = new ConnectionSourceUtils();
	/**
	 * 取得系统默认的连接
	 * @return
	 */
	public static Connection getConn() {
		if(conn == null)
			try {
				conn =connSource.getConnection();
			} catch (SQLException e) {
				System.out.println("取得连接异常"+e.getMessage());
			}
		return conn;
	}

	/**关闭部分资源方法*/
	public static void closeAll(Statement stmt,ResultSet rs){
		if (rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("RS关闭发生异常");
				e.printStackTrace();
			}
		}
		if (stmt!=null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("pstmt关闭发生异常");
				e.printStackTrace();
			}
		}
	}
	
	
	
	

}
