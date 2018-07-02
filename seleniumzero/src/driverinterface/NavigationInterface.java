/**
 * 
 */
package driverinterface;
import java.util.concurrent.TimeUnit;    

import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
/** 
 * @author 
 * @version 创建时间：2017年8月24日 上午10:07:15 
 * 类说明 
 */
/**
 * driver.get("URL")-导航到应用程序
 * element.sendKeys("inputtext")-输入文本输入框
 * element.clear()-	从输入框清空内容
 * select.deselectAll()-这将取消选择页面上的第一个选择所有选项
 * select.selectByVisibleText("some text")
 * driver.switchTo().window("windowName")-
 * driver.switchTo().frame("frameName")-移动到frame
 * driver.switchTo().alert()-移动到alert
 * driver.navigate().to("URL")-移动到URL
 * driver.navigate().forward()
 * driver.navigate().back()
 * driver.close()
 * driver.quit()
 * driver.refresh()	
 */
public class NavigationInterface 
{

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
        //driver.get("https://www.baidu.com"); 
         driver.navigate().to("http://www.baidu.com");
        Thread.sleep(5000);  
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);   
        // to(String url)在当前页打开新的网页  
        driver.navigate().to("http://news.baidu.com");  
        Thread.sleep(5000);  
        // back()后退到百度首页  
        driver.navigate().back();  
        Thread.sleep(5000);  
        // forward() 前进到百度新闻  
        driver.navigate().forward();  
        Thread.sleep(5000);  
        // 刷新当前页  
        driver.navigate().refresh();
        driver.close();
    }

}
