/**
 * 
 */
package javabasic;
/** 
 * @author 
 * @version ����ʱ�䣺2017��9��12�� ����2:42:10 
 * ��˵�� 
 */import java.io.File;  
 import java.io.IOException;  
 import java.io.PrintWriter; 
/**
 *�ļ������������ǵ�Ҫ�ر��ļ��������һֱ���ڴ��м��أ��˷��ڴ���Դ��
 *������filename.txt�����㵱ǰeclipse��Ŀ�ĸ�Ŀ¼�����ɣ���������������Ҽ�����Ŀ���ƣ�ѡ��ˢ��
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
            pw.println("����һ�������ļ�");  
            pw.println(1234567);  
            pw.close();  
            System.out.println("���");  
        } 
		catch (IOException e)
		{  
              
            e.printStackTrace();  
        }  
		

	}

}
