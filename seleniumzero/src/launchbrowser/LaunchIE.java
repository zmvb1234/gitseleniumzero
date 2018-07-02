/**
 * 
 */
package launchbrowser;
import java.util.concurrent.TimeUnit;    
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.ie.InternetExplorerDriver; 
/** 
 * @author
 * @version 创建时间：2017年8月23日 下午7:16:05 
 * 类说明 
 */
/**
 * @author Administrator
 *
 */
public class LaunchIE {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", ".\\Tools\\IEDriverServer.exe");    
        //初始化一个IE浏览器实例，实例名称叫driver    
        WebDriver driver = new  InternetExplorerDriver();   
        //最大化窗口    
        driver.manage().window().maximize();    
        //设置隐性等待时间    
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);    
        // get()打开一个站点    
        driver.get("https://www.baidu.com");    
        //getTitle()获取当前页面title的值    
        System.out.println("当前打开页面的标题是： "+ driver.getTitle());     
        //关闭并退出浏览器    
        driver.quit();    
            
	}

}
