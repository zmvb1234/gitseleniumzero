/**
 * 
 */
package driverfunction;
/** 
 * @author
 * @version 创建时间：2017年8月24日 下午3:15:17 
 * 类说明 
 */
import java.util.concurrent.TimeUnit;    
import org.openqa.selenium.WebDriver;   
import org.openqa.selenium.chrome.ChromeDriver;
/**
 *driver.getTitle()
 *主要是用来判断，我们当前页打开的是不是正确的
 */
public class GetTitle {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");    
	        WebDriver driver = new ChromeDriver();    
	        driver.manage().window().maximize();    
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
	        driver.get("https://www.baidu.com");    
	        Thread.sleep(200);  
	        String title = driver.getTitle();  
	        System.out.println(title);  
	        assert title =="百度一下，你就知道";  
	        // 或者这样写断言  
	        assert title.equals("百度一下，你就知道"); 
	        driver.quit();
	}

}
