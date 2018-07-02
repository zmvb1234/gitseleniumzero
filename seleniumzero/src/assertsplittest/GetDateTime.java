/**
 * 
 */
package assertsplittest;
/** 
 * @author 
 * @version 创建时间：2017年9月30日 上午10:17:45 
 * 类说明 
 */
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
/**
 * @author Administrator
 *
 */
public class GetDateTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	     DateFormat dateformat= new SimpleDateFormat("yyyyMMdd-HHmmss");  
	        //利用Date()获取当前时间  
	        Date date = new Date();   
	        //格式化时间,并用String对象存储  
	        String date1 = dateformat.format(date);             
	        //打印格式化时间到控制台  
	        System.out.println(date1);
	}

}
