/**
 * 
 */
package testngtestrefer;
/** 
 * @author 
 * @version 创建时间：2017年9月30日 下午2:09:30 
 * 类说明 
 */
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;  
import org.testng.annotations.Parameters;  
import org.testng.annotations.Test; 
/**
 * @author Administrator
 *
 */
public class TestCrossBrowser {

	/**
	 *  @Factory 标记这个方法是一个工厂，方法必须返回的是一个对象。
	 *  @Listeners 在一个测试方法上定义一个监听。例如Selenium自动化测试中需要用到这个事件监听功能，方便我们输出日志。
	 * 
	 */
	
	     // 这行@Test一定要写，如果不写，表示当前没有需要执行的脚本。
	     //你可以测试不写，然后run testng.xml试试看，会发生什么
	     @Test    
		 @Parameters("Browser")  //给一个方法传递参数
	public void startBrowser (String Browser) throws InterruptedException
		 {  
		        if(Browser.equalsIgnoreCase("Firefox"))
		        {  
		            System.setProperty("webdriver.gecko.driver", ".\\Tools\\geckodriver.exe");  
		            WebDriver driver = new FirefoxDriver();
		            //driver.manage().window().maximize();  
		            driver.get("https://www.baidu.com");
		            Thread.sleep(3000);
		            driver.quit();  
		        }  
		        else if(Browser.equalsIgnoreCase("Chrome"))
		        {  
		            System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");  
		            WebDriver driver = new ChromeDriver();  
		            driver.manage().window().maximize();  
		            driver.get("https://www.baidu.com");
		            Thread.sleep(3000);
		            driver.quit();  
		        }  
		
		 }
	

}