/**
 * 
 */
package testngdemo2;

import org.testng.annotations.Test;

/** 
 * @author 
 * @version ����ʱ�䣺2017��12��7�� ����9:53:37 
 * ��˵�� 
 */
/**
 * @author Administrator
 *
 */
public class TimeOutTest1 {
	
	@Test(timeOut = 3000)  
    public void loginTest(){  
        try{  
        	//Thread.sleep(3100);
        	Thread.sleep(2800);  
        }catch (InterruptedException e){  
            System.out.println(e.toString());  
        }  
	}
}
