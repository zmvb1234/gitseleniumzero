/**
 * 
 */
package filerefer;
/** 
 * @author
 * @version 创建时间：2017年9月22日 下午2:28:47 
 * 类说明 
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
		// 加载CSV文件  
        CSVReader reader = new CSVReader(new FileReader(".\\Files\\test.csv"));  
        // t把内容添加到list中  
        List<String[]> li=reader.readAll();  
        System.out.println("总共行数是：  "+li.size());   
        // 新建一个Itera引用  
        Iterator<String[]>i1= li.iterator();  
        // I遍历每个值  
        while(i1.hasNext())
        {  
        String[] str=i1.next();  
        System.out.print(" 本行的值为 ");  
        for(int i=0;i<str.length;i++)  
            {  
                System.out.print(" "+str[i]);  
            }  
           System.out.println("   ");   
        }  
        reader.close();
        
    }  
}
