/**
 * 
 */
package javabasic;
/** 
 * @author 
 * @version ����ʱ�䣺2017��9��12�� ����2:51:52 
 * ��˵�� 
 */
import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;
/**
 * @author Administrator
 *
 */
public class FileOperate1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BufferedReader br = null;  
        
        try
        {  
              
            br = new BufferedReader(new FileReader("filename.txt"));  
            String line;  
            while((line = br.readLine())!=null)
            {  
                System.out.println(line);  
            }  
         } 
        catch (IOException e)
        {  
              
            e.printStackTrace();  
        }  

	}

}
