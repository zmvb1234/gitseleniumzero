/**
 * 
 */
package testngdemo2;

import org.testng.annotations.Test;

/** 
 * @author 
 * @version 创建时间：2017年12月7日 下午2:03:49 
 * 类说明 
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
