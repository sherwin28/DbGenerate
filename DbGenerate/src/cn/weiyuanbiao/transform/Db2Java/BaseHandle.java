package cn.weiyuanbiao.transform.Db2Java;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import oracle.sql.SQLName;
import cn.weiyuanbiao.entity.FieldEntity;
import cn.weiyuanbiao.entity.TableEntity;
import cn.weiyuanbiao.transform.CommonHandle;
import cn.weiyuanbiao.util.ConnectionSourceUtils;
import cn.weiyuanbiao.util.DbConnUtil;
import cn.weiyuanbiao.util.PropertiesUtils;
import cn.weiyuanbiao.util.StringUtils;

public class BaseHandle extends CommonHandle{
	static String dbType = PropertiesUtils.getVal("dbType");
	static String dbName = PropertiesUtils.getVal("dbName");
	
	public static String sqlNameToClassName(String name,String regx){
		return StringUtils.firstToUpper(StringUtils.toCenterUpperCase(StringUtils.filterStr(regx, name)));
	}
	
	/**
	 * 获得所有表名
	 * @param conn
	 * @return
	 * @throws IOException
	 */
	public static List<TableEntity> getTables(String filterStr) throws IOException {
		Connection conn = DbConnUtil.getConn();
		List<TableEntity> list = new ArrayList<TableEntity>();
		String sql = "";
		java.sql.Statement sta = null;
		java.sql.ResultSet rs =null;
		if (dbType.equals("oracle"))
			sql = "select t.table_name from user_tables t";
		else if (dbType.equals("mysql"))
//			SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = 'zhaoche'
			sql = " select table_name,table_comment from INFORMATION_SCHEMA.TABLES where table_schema='"
					+ dbName + "'";
		System.out.println("sql语句：" + sql);
		try {
			sta = conn.createStatement();
			rs = sta.executeQuery(sql);
			while (rs.next()) {
				String tableName = rs.getString("table_name");
				String table_comment = rs.getString("table_comment");
				table_comment = table_comment.substring(0,table_comment.indexOf("InnoDB"));
				TableEntity te = new TableEntity();
				te.setTableSqlName(tableName.toUpperCase());
				te.setTableClassName(sqlNameToClassName(tableName.toLowerCase(),filterStr));
				te.setTableNote(table_comment);
				te.setFields(getTableColumns(tableName));
				System.out.println(tableName+"    ---:"+table_comment);
				list.add(te);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DbConnUtil.closeAll(sta, rs);
		}
		return list;
	}
	
	/**
	 * 获得所有列
	 * @param conn
	 * @return
	 * @throws IOException
	 */
	public static List<FieldEntity> getTableColumns(String table_name) throws IOException {
		Connection conn = DbConnUtil.getConn();
		List<FieldEntity> list = new ArrayList<FieldEntity>();
		String sql = "";
		java.sql.Statement sta = null;
		java.sql.ResultSet rs =null;
		if (dbType.equals("oracle"))
			//oracle 数据库
			sql = "select t.table_name from user_tables t";
		else if (dbType.equals("mysql"))
//			select TABLE_NAME,column_name,COLUMN_COMMENT,column_TYPE from INFORMATION_SCHEMA.columns where table_schema='zhaoche'
			sql = " select column_name,column_comment,column_type from INFORMATION_SCHEMA.columns where table_schema='"
					+ dbName + "' and table_name = '"+table_name+"'";
		System.out.println("sql语句：" + sql);
		try {
			sta = conn.createStatement();
			rs = sta.executeQuery(sql);
			while (rs.next()) {
				String column_name = rs.getString("column_name");
				String column_comment = rs.getString("column_comment");
				String column_type = rs.getString("column_type");
				FieldEntity fe = new FieldEntity();
				fe.setFieldClassName(StringUtils.toCenterUpperCase(column_name));
				fe.setFieldSqlName(column_name);
				fe.setFieldSqlType(column_type);
				fe.setFieldClassType(mysqlTypeTrans2Java(column_type));
				fe.setFieldNote(column_comment);
				System.out.println(column_name+"    ---:"+column_comment);
				list.add(fe);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DbConnUtil.closeAll(sta, rs);
		}
		return list;
	}
	
	public static String mysqlTypeTrans2Java(String type) {
		if (type.contains("tinyint")) {
			return "boolean";
		} else if (type.contains("int")) {
			return "int";
		} else if (type.contains("varchar") || type.contains("date")
				|| type.contains("time") || type.contains("datetime")
				|| type.contains("timestamp") || type.contains("text")
				|| type.contains("enum") || type.contains("set")) {
			return "String";
		} else if (type.contains("binary") || type.contains("blob")) {
			return "byte[]";
		} else {
			return "String";
		}
	}
	
	
	public static void main(String[] args) throws SQLException {
		try {
			BaseHandle.getTables("");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
