/**
 * 
 */
package assertsplittest;
/** 
 * @author 
 * @version ����ʱ�䣺2017��9��30�� ����10:17:45 
 * ��˵�� 
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
	        //����Date()��ȡ��ǰʱ��  
	        Date date = new Date();   
	        //��ʽ��ʱ��,����String����洢  
	        String date1 = dateformat.format(date);             
	        //��ӡ��ʽ��ʱ�䵽����̨  
	        System.out.println(date1);
	}

}
