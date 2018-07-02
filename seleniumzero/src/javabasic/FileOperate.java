/**
 * 
 */
package javabasic;
/** 
 * @author 
 * @version 创建时间：2017年9月12日 下午2:42:10 
 * 类说明 
 */import java.io.File;  
 import java.io.IOException;  
 import java.io.PrintWriter; 
/**
 *文件操作结束，记得要关闭文件，否则会一直在内存中加载，浪费内存资源。
 *创建的filename.txt会在你当前eclipse项目的根目录下生成，如果看不到，请右键该项目名称，选择刷新
 *
 */
public class FileOperate {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try{  
            
            File file = new File("filename.txt");  
              
            if(!file.exists())
            {  
                file.createNewFile();  
            }  
              
            PrintWriter pw = new PrintWriter(file);  
            pw.println("这是一个测试文件");  
            pw.println(1234567);  
            pw.close();  
            System.out.println("完成");  
        } 
		catch (IOException e)
		{  
              
            e.printStackTrace();  
        }  
		

	}

}
