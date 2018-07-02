/**
 * 
 */
package driverinterface;
/** 
 * @author 
 * @version 创建时间：2017年8月24日 上午11:47:40 
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
public class FindElementByClassName {

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
        driver.findElement(By.className("s_ipt")).sendKeys("Java");
        driver.findElement(By.xpath(".//*[@id='su']")).click();
        Thread.sleep(2000);
        //关闭并退出浏览器    
        driver.quit(); 
	}

}
