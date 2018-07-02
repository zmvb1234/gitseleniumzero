/**
 * 
 */
package driverinterface;
/** 
 * @author 
 * @version 创建时间：2017年8月24日 下午1:57:34 
 * 类说明 
 */
import java.util.List;  
import java.util.concurrent.TimeUnit;  
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * findElements接口下也有八种方法，这里不一一举例。
 * 下面的例子用到了集合和for循环，不熟悉的可以先去了解一下。
 */
public class FindElementsTEST {

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
	     driver.get("https://news.baidu.com");      
	     List <WebElement> links = driver.findElements(By.xpath(".//*[@id='pane-news']/ul[1]/li/a"));   
	    for(int i=0; i<links.size(); i++)
	    {  
	            System.out.println(links.get(i).getText());  
	    }
	    driver.quit();
	}
}
