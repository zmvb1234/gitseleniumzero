/**
 * 
 */
package elementoperate;
/** 
 * @author 
 * @version 创建时间：2017年8月24日 下午2:59:34 
 * 类说明 
 */
import java.util.concurrent.TimeUnit;  
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * @author Administrator
 *
 */
public class ElementClear {

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
        WebElement ele = driver.findElement(By.id("kw"));  
        ele.sendKeys("Java Selenium 教程");  
        Thread.sleep(2000);   
        ele.clear(); 
        Thread.sleep(2000); 
        driver.quit();
	}

}
