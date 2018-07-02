/**
 * 
 */
package driverinterface;
/** 
 * @author 
 * @version 创建时间：2017年8月24日 下午1:47:51 
 * 类说明 
 */
import java.util.concurrent.TimeUnit;  
import org.openqa.selenium.By;  
import org.openqa.selenium.Keys;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * 查看网页元素的时候，全是开始的input 或者button,div,label等等，这些标签就叫tagname。
 * 一般利用tagname定位元素会出现很多个元素，单独找一个唯一的元素，利用tagname很难
 *
 */
public class FindElementByTagname {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", ".\\Tools\\geckodriver.exe");    
        WebDriver driver = new FirefoxDriver();   
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);    
        driver.get("http://news.baidu.com");    
        driver.findElement(By.tagName("body")).sendKeys(Keys.F11);
        driver.quit();
	}

}
