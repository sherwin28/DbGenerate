package cn.weiyuanbiao.transform;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import cn.weiyuanbiao.entity.AuthorEntity;
import cn.weiyuanbiao.util.PropertiesUtils;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class CommonHandle {
	
	private static Configuration cfg = null;
	
	public final static String out_path = "./out_gen/";
	

	public static Configuration getConfiguration() {
		if (null == cfg) {
			cfg = new Configuration();
			cfg.setClassForTemplateLoading(CommonHandle.class,
					"/template");
			cfg.setDefaultEncoding("UTF-8");
		}
		return cfg;
	}
	
	protected void generate(String templateFileName, Map<String, Object> propMap,
			String fileName) {
		try {
			Template t = CommonHandle.getConfiguration().getTemplate(
					templateFileName);
			fileName = CommonHandle.out_path + fileName;
			new File(fileName.substring(0, fileName.lastIndexOf("/"))).mkdirs();
			File afile = new File(fileName);
			Writer out = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(afile), "UTF-8"));
			System.out.println(propMap);
			t.process(propMap, out);
			out.close();
		} catch (TemplateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected String package2path(String packageName) {
		return packageName.replace('.', '/');
	}

	protected String capFirst(String string) {
		String s = String.valueOf(string.charAt(0)).toUpperCase();
		s = s + string.substring(1);
		return s;
	}

	protected String uncapFirst(String string) {
		String s = String.valueOf(string.charAt(0)).toLowerCase();
		s = s + string.substring(1);
		return s;
	}
	
	public AuthorEntity setAuthor() {
		String author = PropertiesUtils.getVal("author");
		String company = PropertiesUtils.getVal("company");
		String dateFormate = PropertiesUtils.getVal("dateFormate");
		SimpleDateFormat time=new SimpleDateFormat(dateFormate); 
		String createTime = time.format(new Date());
		String version = PropertiesUtils.getVal("version");
		AuthorEntity ae = new AuthorEntity();
		ae.setAuthor(author);
		ae.setCompany(company);
		ae.setCreateTime(createTime);
		ae.setVersion(version);
		return ae;
    }

}
