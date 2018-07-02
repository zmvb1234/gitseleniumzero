/**
 * 
 */
package javabasic;
/** 
 * @author 
 * @version 创建时间：2017年9月12日 下午2:56:59 
 * 类说明 
 */
import java.util.Date;
import java.text.SimpleDateFormat; 
/**
 * @author Administrator
 *
 */
public class DateBasic {

	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     
		Date date = new Date();  
        // 把时间安装字符串格式输出，可读性更强  
        System.out.println(date.toString());  
        // 打印出1970年1月1日到现在的秒数  
        System.out.println(date.getTime());  
        // 打印月份，记得月份在结果上要加1，因为程序里1月用0表示，直到12月份用11这个索引表示  
        System.out.println(date.getMonth());  
        System.out.println(date.getDay());  
        System.out.println(date.getYear());  
        System.out.println(date.getHours());
        Date date1 = new Date();  
        SimpleDateFormat sdf = new SimpleDateFormat("E yyyy-MM-dd HH-mm-ss");  
        System.out.println(sdf.format(date1));  
        sdf = new SimpleDateFormat(" yyyy-MM-dd HH:mm:ss");  
        System.out.println(sdf.format(date1));  
        sdf = new SimpleDateFormat(" yyyyMMdd-HHmmss");  
        System.out.println(sdf.format(date1));  
        sdf = new SimpleDateFormat(" yyyyMMdd-HHmmss.S");  
        System.out.println(sdf.format(date1));  
	}

}
