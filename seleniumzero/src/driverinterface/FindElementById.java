/**
 * 
 */
package driverinterface;
/** 
 * @author 
 * @version 创建时间：2017年8月24日 上午10:53:13 
 * 类说明 
 */

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * 
 *
 */
public class FindElementById {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");  
        WebDriver driver = new ChromeDriver();   
        driver.get("https://www.baidu.com");  
        //By id 查找元素  
        driver.findElement(By.id("kw")).sendKeys("Java");
        //driver.close();
        Thread.sleep(2000);
        driver.quit();
	}

}
