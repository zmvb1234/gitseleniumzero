/**
 * 
 */
package testngdemo2;

import org.testng.annotations.Test;

/** 
 * @author 
 * @version 创建时间：2017年12月7日 上午9:53:37 
 * 类说明 
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
