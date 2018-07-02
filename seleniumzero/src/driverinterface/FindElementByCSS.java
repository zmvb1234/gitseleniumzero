/**
 * 
 */
package driverinterface;
/** 
 * @author
 * @version 创建时间：2017年8月24日 下午1:42:51 
 * 类说明 
 */
import java.util.concurrent.TimeUnit;  

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * 静态网页主要使用HTML语言.动态效果，一般使用CSS还有JavaScpirt.
 * 现在流行的H5前端开发，也是HTML5+CSS+JavaScript
 *
 */
public class FindElementByCSS {

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
        driver.findElement(By.cssSelector("#kw")).sendKeys("Java"); 
        driver.findElement(By.cssSelector("#su")).click();  
        Thread.sleep(2000);
        //关闭并退出浏览器    
        driver.quit();
	}

}
