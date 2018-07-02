/**
 * 
 */
package elementoperate;
/** 
 * @author 
 * @version 创建时间：2017年9月12日 下午5:28:08 
 * 类说明 
 */
import java.util.concurrent.TimeUnit;  

import org.openqa.selenium.By;  
import org.openqa.selenium.NoSuchElementException;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.chrome.ChromeDriver;  
import org.openqa.selenium.support.ui.FluentWait;  
import org.openqa.selenium.support.ui.Wait;  
  

import com.google.common.base.Function; 
/**
 * FluentWait就是一个普通的类，我们使用这个类能支持一直等待直到特定的条件出现。
1）是一个类而且是包org.openqa.selenium.support.ui的一部分
2）是Wait接口的一种实现
3）每个Fluent wait，我们可以设置等待最大时间，而且可以做设置等待的频率去检查一些特定的条件。
FluentWait 和 Explicit Wait的区别：简单来说就是Explicit Wait里有一些设定好了的前置条件的等待方式，
而Fluent wait你可以设置自己的方法去处理各种等待的问题。
 *
 */
public class FluentWaitOperate {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");  
	     WebDriver driver = new ChromeDriver();  
	     driver.get("http://www.baidu.com/");  
	     driver.manage().window().maximize();  
	        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver) 
	                   .withTimeout(60, TimeUnit.SECONDS)  
	                   .pollingEvery(2, TimeUnit.SECONDS)  
	                   .ignoring(NoSuchElementException.class);  
	        @SuppressWarnings("unused")
			WebElement ele1 = wait.until(new Function<WebDriver, WebElement>() 
	        	{  
	             public WebElement apply(WebDriver driver) 
	             {  
	               return driver.findElement(By.id("1234"));  
	             }  
	           
	           });     

	}

}
