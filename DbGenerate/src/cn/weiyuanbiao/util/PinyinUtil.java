package cn.weiyuanbiao.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;

public class PinyinUtil {
    private String pinyinName = "";
    
    /**
    * 汉字转拼音的方法
    * @param name 汉字
    * @return 拼音
    */
    private String HanyuToPinyin(String name){
    	Pattern p = Pattern.compile("[\u4e00-\u9fa5]");
    	  Matcher m=p.matcher(name);
    	  while(m.find())
    	  {
    	   System.out.println(m.group());
    	   name = m.group();
    
        char[] nameChar = name.toCharArray();
        HanyuPinyinOutputFormat defaultFormat = 
                                           new HanyuPinyinOutputFormat();
        defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        for (int i = 0; i < nameChar.length; i++) {
            if (nameChar[i] > 128) {
                try {
                    pinyinName += PinyinHelper.toHanyuPinyinStringArray
                                           (nameChar[i], defaultFormat)[0];
                    System.out.println("pinyinName::"+pinyinName);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } 
        }
    	  }
    	  System.out.println("name:"+name);
        return pinyinName;
    }
    
    /**
     * 汉字转拼音首字母的方法
     * @param name 汉字
     * @return 拼音
     */
    public String HanyuToPinyinTou(String name){
    	Pattern p = Pattern.compile("[\u4e00-\u9fa5]");
    	Matcher m=p.matcher(name);
    	String pyt = "";
    	String py = "";
    	while(m.find())
    	{
//    		System.out.println("发现中文:"+m.group());
    		py = m.group();
    		char[] nameChar = py.toCharArray();
    		HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
    		defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
    		defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
    		for (int i = 0; i < nameChar.length; i++) {
    			if (nameChar[i] > 128) {
    				try {
    					pyt = PinyinHelper.toHanyuPinyinStringArray(nameChar[i], defaultFormat)[0].substring(0,1);
//    					System.out.println("pyt::"+pyt);
    					name = name.replace(py, pyt);
    				} catch (Exception e) {
    					e.printStackTrace();
    				}
    			} 
    		}
    	}
//    	System.out.println("name:"+name);
    	return name;
    }
 
    public static void main(String[] args) {
        System.out.println(new PinyinUtil().HanyuToPinyinTou("掌声wy"));
    }    
}