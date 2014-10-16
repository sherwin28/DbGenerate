package cn.weiyuanbiao.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.crypto.Cipher;

/**
 * @author wenzheng
 * @date   2013-6-22
 * 
 */
public class FileUtils extends org.apache.commons.io.FileUtils{

	public static final int DEFAULT_SIZE=1024;
	
	/***
     * 数据读取与写入
     * @param in
     * @param out
     * @return
     */
    public synchronized static boolean  fileCopy(InputStream in,OutputStream out){
    	try {
    		
    		byte[] buffer= new byte[DEFAULT_SIZE];  
    		int length=0;
    		while ((length=in.read(buffer))!= -1)  
    		{  
    			out.write(buffer,0,length);  
    		}  
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}finally  
        {  
            try  
            {  
                if(null!=out)out.close();  
                if(null!=in)in.close();  
            }  
            catch (IOException e)  
            {  
                e.printStackTrace();  
            }  
        } 
    	return true;
    }
    
    
    /***
     * 数据读取与写入
     * @param inFile
     * @param outFile
     * @param cipher
     * @return
     */
    public synchronized static boolean  fileCopy(File inFile,File outFile,Cipher cipher){
    	BufferedInputStream bis=null;
    	BufferedOutputStream bos=null;
    	int blockSize = cipher.getBlockSize() * DEFAULT_SIZE;  //返回块的大小（以字节为单位）。
		int outputSize = cipher.getOutputSize(blockSize);  //返回操作结果所需的输出缓冲区长度

    	try {
    		bis=new BufferedInputStream(new FileInputStream(inFile));
    		bos=new BufferedOutputStream(new FileOutputStream(outFile));
    		byte[] inBytes = new byte[blockSize];
    		byte[] outBytes = new byte[outputSize];
    		int inLength = 0;
    		while ((inLength = bis.read(inBytes))==blockSize) {  //继续多部分加密或解密操作
    			int outLength = cipher.update(inBytes, 0, blockSize, outBytes);
    			bos.write(outBytes, 0, outLength);
    		}
    		if (inLength > 0){
    			outBytes = cipher.doFinal(inBytes, 0, inLength);// 结束多部分加密或解密操作
    			if(null!=outBytes)bos.write(outBytes,0,outBytes.length);
    		}  
    	} catch (Exception e) {
    		e.printStackTrace();
    		return false;
    	}finally  
    	{  
    		try  
    		{  
    			if(null!=bis)bis.close();  
    			if(null!=bos)bos.close();  
    		}  
    		catch (IOException e)  
    		{  
    			e.printStackTrace();  
    		}  
    	} 
    	return true;
    }
    
    
    /***
     * 获取目录下的的子目录或者子文件
     * @param dir   目录文件
     * @param name  子目录或者子文件名称
     * @return
     * @throws FileNotFoundException
     */
   public static File  getChildFile(File dir,String name) throws FileNotFoundException{
	   if(null==dir||(dir!=null&&!dir.exists()))
		   throw new FileNotFoundException();
	   File[] files=dir.listFiles();
	   for (int i = 0; i < files.length; i++) {
		   if(files[i].getName().equals(name))
			   return files[i];
	   }
	   return null;
   }
    
    
   /****
    * 创建文件将输入流写入文件中
    * @param file			文件
    * @param inputStream	输入流
    * @return
    */
   public static File  createFile(File file,InputStream inputStream){
	   BufferedOutputStream bos=null;
	   try {
		   bos=new BufferedOutputStream(new FileOutputStream(file));
		   int  length=0;
		   byte[] buffer= new byte[DEFAULT_SIZE]; 
		   while ((length = inputStream.read(buffer))!=-1) {  //读取字节数组
   				bos.write(buffer, 0, length);
   			}
		} catch (Exception e) {
			e.printStackTrace();
		 }finally  
	    	{  
	    		try  
	    		{  
	    			if(null!=inputStream)inputStream.close();  
	    			if(null!=bos)bos.close();  
	    		}  
	    		catch (IOException e)  
	    		{  
	    			e.printStackTrace();  
	    		}  
	    	} 
	  return file;
   }
}

