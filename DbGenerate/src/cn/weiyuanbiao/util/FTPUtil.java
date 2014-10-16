package cn.weiyuanbiao.util;

import java.io.InputStream;

import org.apache.commons.net.ftp.FTPClient;


/****
 * Ftp工具
 * @author wenz
 * @version 1.0
 * 2012-2-10 11:16
 */
public class FTPUtil {
	public static final int ASCII_FILE_TYPE = 0;
	public static final int IMAGE_FILE_TYPE = 2;
	public static final int BINARY_FILE_TYPE = 2;
	public static final int LOCAL_FILE_TYPE = 3;
	
	/***
	 * ftp连接
	 * @param host     ftp服务器
	 * @param username  用户名
	 * @param password  密码
	 * @return  ftp连接实例
	 */
	public static FTPClient connect(String host,String username,String password){
		FTPClient ftpClient=new FTPClient();
		try {
			ftpClient.connect(host);
			ftpClient.login(username, password);
			ftpClient.setBufferSize(1024 * 2);  //缓存大小
	        ftpClient.setDataTimeout(30 * 1000);  //超时 
            ftpClient.enterLocalPassiveMode();    // 设置传输协议  
		} catch (Exception e) {
			System.out.println(e);
		}
		return ftpClient;
	}
	
	
	public enum FILE_TYPE{
		ASCII_FILE_TYPE(0),IMAGE_FILE_TYPE(2),BINARY_FILE_TYPE(2),LOCAL_FILE_TYPE(3);
		 private final int value;
	        public int getValue() {
	            return value;
	        }
	        //构造器默认也只能是private, 从而保证构造函数只能在内部使用
	      FILE_TYPE(int value) {
	            this.value = value;
	       }
	}
	

	/*****
	 * 文件上传
	 * @param host            远程服务器
	 * @param username		     用户名
	 * @param password		     密码
	 * @param path			    上传路径 （ftp的路径以/结束）
	 * @param fileName	               上传文件名 （上传到ftp的文件名）
	 * @param FILE_TYPE       上传文件类型   
	 * @param inputStream     输入流  （要上传的文件输入流）
	 * @return  boolean 是否上传成功
	 */
	public static boolean  uploadFile(String host,String username,String password,String path,
			String fileName,FILE_TYPE file_type,InputStream inputStream){
		FTPClient ftpClient=connect(host, username, password);
		try{ 
			if(null!=ftpClient&&ftpClient.isConnected()){
				if(ftpClient.changeWorkingDirectory(path)){  //跳转目录
					ftpClient.setFileType(file_type.getValue());  
					ftpClient.storeFile(new String(fileName.getBytes("GBK"), "iso-8859-1") , inputStream);  
					inputStream.close();
					}
				}
			} catch (Exception e) {  
				e.printStackTrace();
				return false;
		      } finally {  
		    	  if(ftpClient.isConnected()) {  
		    		  try {  
		    			  ftpClient.disconnect();  
		    		  } catch (Exception e) {  
		    			  System.out.println(e);
		    			  return false;
		    		  }  
		    	  }  
		      }
		      return true;
	}
	
	/***
	 * 文件下载
	 * @param host            远程服务器
	 * @param username		     用户名
	 * @param password		     密码
	 * @param path			    下载路径
	 * @param fileName	               下载文件名
	 * @return InputStream 输入流
	 */
	public static InputStream downloadFile(String host,String username,String password,String path,String fileName){
		FTPClient ftpClient=connect(host, username, password);
		InputStream inputStream=null;
		try{ 
			if(null!=ftpClient&&ftpClient.isConnected()){
				if(ftpClient.changeWorkingDirectory(path)){  //跳转目录
					 inputStream = ftpClient.retrieveFileStream(new String(fileName.getBytes("UTF-8"), "iso-8859-1")); 
					}
				}
			} catch (Exception e) {  
				System.out.println(e);
		      } finally {  
		    	   if(ftpClient.isConnected()) {  
		    		   try {  
		    			   ftpClient.disconnect();  
		    			   System.out.println("关闭ftp连接");
		    		   } catch (Exception e) {  
		    			   System.out.println("ftp连接关闭失败");
		    			   System.out.println("FTPUtil.class:"+ e);  
		    		   }  
		    	   }  
		      }
		   return inputStream;
	}
	
}
