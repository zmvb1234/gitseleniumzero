/**
 * 
 */
package driverinterface;
/** 
 * @author 
 * @version 创建时间：2017年8月24日 上午11:20:08 
 * 类说明 
 */
import java.util.concurrent.TimeUnit;  
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver; 
/**
 * XPath一般在实际自动化测试项目中用到比较多，虽然有8种元素定位方法.
 * 但是XPath如果写熟练了，基本上可以用XPath完成百分之95以上的元素定位。
 *
 */
public class FindElementByXpath {

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
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);       
        driver.get("https://www.baidu.com");    
        driver.findElement(By.xpath(".//*[@id='kw']")).sendKeys("Java");  
        driver.findElement(By.xpath(".//*[@id='su']")).click();
        //百度搜索输入框:
        //*/input[@id='kw']
       //*/input[@name='wd']
       //*/input[@class='s_ipt']
       //搜索提交按钮：
       //*/input[@id='su']
       //*/input[@value='百度一下']
       //*/input[@class='bg s_btn']
        Thread.sleep(2000);
        //关闭并退出浏览器    
        driver.quit();    
	}

}
