package cn.weiyuanbiao.transform.Db2Java;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.weiyuanbiao.entity.TableEntity;
import cn.weiyuanbiao.transform.CommonHandle;
import cn.weiyuanbiao.util.DbConnUtil;

public class GeneralHandle extends BaseHandle{
	/**
	 * 装载只有一个表的实例
	 * @param templateFileName   模板名称
	 * @param propMap   
	 */
	public void generalOne(String templateFileName,Map<String, Object> propMap){
		propMap.put("authorEntity", setAuthor());
		TableEntity tableEntity = (TableEntity) propMap.get("tableEntity");
		String packageName = propMap.get("packageName").toString();
		String fileName = tableEntity.getTableClassName()
				+".java";
		generate(templateFileName, propMap, 
				"src/"
				+ package2path(packageName) + "/"+fileName
				);
	}
	
	public void generalAll(String templateFileName,String packageName,String filterStr) throws IOException{
		List<TableEntity> l = BaseHandle.getTables(filterStr);
		for (TableEntity tableEntity : l) {
			Map<String, Object> propMap = new HashMap<String, Object>();
			propMap.put("tableEntity", tableEntity);
			propMap.put("packageName", packageName);
			this.generalOne(templateFileName,propMap);
		}
	}

	

}
