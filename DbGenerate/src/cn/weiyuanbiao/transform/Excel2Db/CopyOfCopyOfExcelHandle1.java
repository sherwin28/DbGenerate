package cn.weiyuanbiao.transform.Excel2Db;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import cn.weiyuanbiao.entity.FieldEntity;
import cn.weiyuanbiao.entity.TableEntity;
import cn.weiyuanbiao.util.PinyinUtil;

public class CopyOfCopyOfExcelHandle1{
	public static PinyinUtil py = new PinyinUtil();
	
	public static List<TableEntity> create_TableEntity(String excelFileName,String fileName,String[] as){
		List<TableEntity> listT = new ArrayList<TableEntity>();
		String filedName = "";
		try {
	          Workbook book = Workbook.getWorkbook(new File("resource/excel/"+fileName));
	          int sheet_num =book.getNumberOfSheets();
	          Sheet sheet = null;
	          int column_num = 0;
	          for (int i = 0; i < sheet_num; i++) {
	  			sheet = book.getSheet(i);
	  			column_num = sheet.getColumns();
//	  			System.out.println("table_name:"+py.HanyuToPinyinTou(sheet.getName())+"("+sheet.getName()+")");
	  			TableEntity te = new TableEntity();
	  			te.setTableSqlName(py.HanyuToPinyinTou(sheet.getCell(1, 0).getContents().replace("-", "_").replace(" ", "")));
	  			te.setTableNote(sheet.getCell(2, 0).getContents());
	  			List<FieldEntity> listFe = new ArrayList<FieldEntity>();
	  			FieldEntity fe1 = new FieldEntity();
				 fe1.setFieldSqlName("dealdate");
				 fe1.setFieldNote("时间");
				 fe1.setFieldSqlType("VARCHAR2");
				 fe1.setFieldSqlLength("20");
				 listFe.add(fe1);
	  			for (int j = 1; j < column_num; j++) {
	  				 Cell cell = sheet.getCell(j, 1);
	  				 String result = cell.getContents();
	  				 if(!"".equals(result)){
	  				 FieldEntity fe = new FieldEntity();
	  				 if(py.HanyuToPinyinTou(result).equals(filedName))
	  				 filedName = py.HanyuToPinyinTou(result)+"_1";
	  				 else
	  				 filedName = py.HanyuToPinyinTou(result).replace("(", "_").replace(")", "").replace(" ", "")
	  				             .replace("（", "_").replace("）", "").replace("-", "_").replace("/", "_")
	  				             .replace("=", "_")
	  				             .replace("#", "_")
	  				             .replace("*", "_")
	  				             .replace("：", "_").replaceAll("^([a-z0-9\\.\\-\\+]+)@([\\da-z\\.\\-]+)\\.([a-z\\.]{2,6})$", "")
	  				             ;
	  				 filedName = filedName.startsWith("_")?filedName.substring(1, filedName.length()):filedName;
	  				 fe.setFieldSqlName(filedName);
	  				 fe.setFieldNote(result);
//	  				 fe.setFieldType("VARCHAR2");
	  				 fe.setFieldSqlType(sheet.getCell(j, 2).getContents());
	  				 fe.setFieldSqlLength(sheet.getCell(j, 3).getContents());
	  				 listFe.add(fe);
//	  	        	 System.out.print(result+"\t");
	  				 }
	  			 }
	  			for (int j = 0; j < as.length; j++) {
	  				FieldEntity fe = new FieldEntity();
	  				fe.setFieldSqlName(py.HanyuToPinyinTou(as[j]));
	  				fe.setFieldNote(as[j]);
	  				fe.setFieldSqlType("VARCHAR2");
	  				fe.setFieldSqlLength("100");
	  				listFe.add(fe);
	  			}
	  			te.setFields(listFe);;
	  			listT.add(te);
	  			System.out.println();
	          }
	          book.close();
	      } catch (Exception e) {
	          System.out.println(e);
	      }
		return listT;
		
	} 
	
	public static void create_tables(String tablespace,String fileName,String[] as) throws IOException{
		StringBuffer sqlAll  = new StringBuffer();
		List<TableEntity> l = create_TableEntity("",fileName,as);
		for (TableEntity tableEntity : l) {
			StringBuffer sql = new StringBuffer();
			List<FieldEntity> lf = tableEntity.getFields();
			String table_name = tableEntity.getTableSqlName();
			table_name = ""+table_name+"";
//			File f = new File("sql/all.sql");
//			if(!f.exists())
//				f.createNewFile();
//			BufferedWriter output = new BufferedWriter(new FileWriter(f));
			if(!lf.isEmpty()&&lf.size()>0){
			sql.append("--create table "+table_name+"("+tableEntity.getTableNote()+") \n");
			sql.append("create table "+table_name+" \n(\n");
			String PkId = "";
			for (FieldEntity ce : lf) {
				if(!"".equals(ce.getFieldSqlName())){
				if(!"INPUTTIME".equals(ce.getFieldSqlName())){
					if("ZFW_ID".equals(ce.getFieldSqlName())){
						PkId = ce.getFieldSqlName();
					}
					if("VARCHAR2".equals(ce.getFieldSqlType()) 
							||"CHAR".equals(ce.getFieldSqlType()))
					sql.append(""+ce.getFieldSqlName() + " "
								+ce.getFieldSqlType()+"("+ce.getFieldSqlLength()+"),\n");
					else
					sql.append(ce.getFieldSqlName() + " "
							+ce.getFieldSqlType()+",\n");
				}
				}
			}
			sql.delete(sql.length()-2, sql.length());//删除最后一个逗号
			sql.append("\n)\n");
			sql.append("tablespace "+tablespace+" \n" +
					"  pctfree 10 \n" +
					"  initrans 1 \n" +
					"  maxtrans 255;\n");
			sql.append(getComment(tableEntity,table_name));
//			sql.append(getPK(table_name,PkId));
			System.out.println(sql.toString());
			sqlAll.append(sql);
//			output.write(sqlAll.toString());
//			output.close();
		}
		}
	}
	
	public static String getComment(TableEntity te,String table_name){
		StringBuffer sb = new StringBuffer();
		sb.append("-- Add comments to the table \n");
		sb.append("comment on table "+table_name+"  is '"+te.getTableNote()+"';\n");
		List<FieldEntity> lf = te.getFields();
		sb.append("-- Add comments to the columns \n");
		for (FieldEntity ce : lf) {
			if(!"".equals(ce.getFieldSqlName()))
			sb.append("comment on column "+table_name+"."+ce.getFieldSqlName()+" is '"+ce.getFieldNote()+"';\n");
		}
		return sb.toString();
		
	}
	
	public static String getPK(String table_name,String pkId){
		StringBuffer sb = new StringBuffer();
		sb.append("-- Add PK to the table \n");
		sb.append("alter table "+table_name+"  add constraint Pk_"+table_name+" primary key ("+pkId+");\n");
		return sb.toString();
	}
	
	public static void main(String[] args) throws IOException {
		String a = "入网时间、合约开始时间、合约结束时间、注销日期、本月用户状态、发展人、机卡分离标志、近一年欠费金额、近一年出账金额、发展渠道、发展二级渠道";
		String[] as = a.split("、");
//		for (int i = 0; i < as.length; i++) {
//			System.out.println(as[i]);
//		}
		create_tables("RPT_GRP","temp2.xls",as);
//		create_tables("users");
	}
}
