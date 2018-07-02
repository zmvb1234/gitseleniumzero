/**
 * 
 */
package elementoperate;
/** 
 * @author 
 * @version 创建时间：2017年8月25日 下午4:51:41 
 * 类说明 
 */
import java.util.ArrayList;  
import java.util.concurrent.TimeUnit;   

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
/**
 * @author Administrator
 *
 */
public class RaidoButtonOperate {

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
	            
	        driver.get("http://news.baidu.com");    
	         
	        Thread.sleep(1000);  
	          
	        // 把单选按钮放在一个list里面  
	        ArrayList<WebElement> search_type = (ArrayList<WebElement>) driver.findElements(By.xpath("//*/p[@class='search-radios']/input"));  
	          
	        for(WebElement ele : search_type)
	        {  
	            ele.click();  
	            Thread.sleep(1000);  
	        }
	        driver.quit();
	}
}
