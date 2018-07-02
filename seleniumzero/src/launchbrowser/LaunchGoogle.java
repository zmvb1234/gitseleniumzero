/**
 * 
 */
package launchbrowser;
import java.util.concurrent.TimeUnit;    

import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver; 
/** 
 * @author 
 * @version 创建时间：2017年8月23日 下午5:49:48 
 * 类说明 
 */
/**
 * @author Administrator
 *
 */
public class LaunchGoogle 
         {
	    public static void main(String[] args) 
	    {    
	    System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");    
        //初始化一个chrome浏览器实例，实例名称叫driver    
        WebDriver driver = new ChromeDriver();
        //最大化窗口    
        driver.manage().window().maximize();
       //设置隐性等待时间    
       driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);    
       // get()打开一个站点    
       driver.get("https://www.baidu.com");    
      //getTitle()获取当前页面title的值    
       System.out.println("当前打开页面的标题是： "+ driver.getTitle());
       try
       {  
           String baidu_title = "百度一下，你就知道"; 
         //Java中有一个方法叫assert,中文意思叫断言，assert后面跟着的是一个表达式，表达式的值是布尔型.
           assert baidu_title == driver.getTitle();  
           System.out.println("Test Pass!"); 
           Thread.sleep(3000);
         }
       catch(Exception e)
       {  
           e.printStackTrace();  
       }  
       //关闭并退出浏览器    
     driver.quit();   
	
	}
}
