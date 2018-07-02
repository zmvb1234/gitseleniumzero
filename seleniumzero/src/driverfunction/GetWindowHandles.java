/**
 * 
 */
package driverfunction;
/** 
 * @author
 * @version 创建时间：2017年8月24日 下午3:27:10 
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
public class GetWindowHandles {

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
        //线程等待
        Thread.sleep(1000);  
        WebElement setHome_link = driver.findElement(By.partialLinkText("设为主页"));  
        setHome_link.click();  
        Thread.sleep(1000);  
        System.out.println(driver.getWindowHandles());
        Thread.sleep(1000);
        driver.close();
        Thread.sleep(3000);
        driver.quit();
        /**
    	 * close方法是，关闭当前窗口.
    	 * 如果当前窗口只有一个tab，那么这个close方法就相当于关闭了浏览器。
    	 * quit方法就是直接退出并关闭所有关联的tab窗口。
    	 * 
    	 */
	}

}
