/**
 * 
 */
package driverinterface;
/** 
 * @author 
 * @version 创建时间：2017年8月24日 下午1:38:07 
 * 类说明 
 */
import java.util.concurrent.TimeUnit;  
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * @author Administrator
 *
 */
public class FindElementByPartialLinkText {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");    
        WebDriver driver = new ChromeDriver();    
        driver.manage().window().maximize();    
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);   
        driver.get("https://www.baidu.com");    
        driver.findElement(By.partialLinkText("123")).click();  
        driver.quit();
	}

}
