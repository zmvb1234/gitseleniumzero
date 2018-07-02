/**
 * 
 */
package testngdemo2;

import org.testng.annotations.Test;

/** 
 * @author 
 * @version ����ʱ�䣺2017��12��7�� ����2:03:49 
 * ��˵�� 
 */
/**
 * @author Administrator
 *
 */
public class TestNGDepends2 {
	@Test(groups = {"tomcat"})  
    public void restartTomcatService(){  
        System.out.println("Restart the tomcat server when it is down!");  
    }  
  
    @Test(groups = {"tomcat"})  
    public void tomcatServiceIsDown(){  
        System.out.println("tomcat service is down!");  
    }  
  
    @Test(groups = {"app"})  
    public void startAppServer(){  
        System.out.println("Start App service");  
    }  
  
    @Test(groups = {"app"})  
    public void shutDownApp(){  
        System.out.println("Shutdown App service");  
    }  
}
