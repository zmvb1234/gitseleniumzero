/**
 * 
 */
package driverfunction;
/** 
 * @author 
 * @version 创建时间：2017年8月24日 下午3:39:42 
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
public class SwitchToWindowHandle {

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
	     driver.get("https://www.jd.com/");     
	     Thread.sleep(1000);   
	     //点击京东左侧菜单中的 手机  
	     WebElement phone_link = driver.findElement(By.linkText("手机"));  
	     phone_link.click();  
	     Thread.sleep(1000);  
	     // 获取当前页面句柄    
	      String handle = driver.getWindowHandle();    
	     // 获取所有页面的句柄，并循环判断不是当前的句柄   
	     for (String temhandle : driver.getWindowHandles()) 
	     {    
	        if (!temhandle.equals(handle)) 
	        {
	                driver.close();  
	                driver.switchTo().window(temhandle); 
	        }
	             
	        }    
	        WebElement xiaomi_link = driver.findElement(By.linkText("小米"));  
	        xiaomi_link.click();  
	        Thread.sleep(5000);
	        driver.quit();
	          
	}

}
