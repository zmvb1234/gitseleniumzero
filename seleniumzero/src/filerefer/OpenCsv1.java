/**
 * 
 */
package filerefer;
/** 
 * @author
 * @version ����ʱ�䣺2017��9��22�� ����2:28:47 
 * ��˵�� 
 */
import java.io.FileReader;  
import java.io.IOException;  
import java.util.Iterator;  
import java.util.List;  

import au.com.bytecode.opencsv.CSVReader;
/**
 * @author Administrator
 *
 */
public class OpenCsv1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		// ����CSV�ļ�  
        CSVReader reader = new CSVReader(new FileReader(".\\Files\\test.csv"));  
        // t��������ӵ�list��  
        List<String[]> li=reader.readAll();  
        System.out.println("�ܹ������ǣ�  "+li.size());   
        // �½�һ��Itera����  
        Iterator<String[]>i1= li.iterator();  
        // I����ÿ��ֵ  
        while(i1.hasNext())
        {  
        String[] str=i1.next();  
        System.out.print(" ���е�ֵΪ ");  
        for(int i=0;i<str.length;i++)  
            {  
                System.out.print(" "+str[i]);  
            }  
           System.out.println("   ");   
        }  
        reader.close();
        
    }  
}
