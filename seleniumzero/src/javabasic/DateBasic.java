/**
 * 
 */
package javabasic;
/** 
 * @author 
 * @version ����ʱ�䣺2017��9��12�� ����2:56:59 
 * ��˵�� 
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
        // ��ʱ�䰲װ�ַ�����ʽ������ɶ��Ը�ǿ  
        System.out.println(date.toString());  
        // ��ӡ��1970��1��1�յ����ڵ�����  
        System.out.println(date.getTime());  
        // ��ӡ�·ݣ��ǵ��·��ڽ����Ҫ��1����Ϊ������1����0��ʾ��ֱ��12�·���11���������ʾ  
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
