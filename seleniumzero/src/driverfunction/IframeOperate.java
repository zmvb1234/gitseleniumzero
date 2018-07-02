/**
 * 
 */
package driverfunction;
/** 
 * @author 
 * @version 创建时间：2017年8月24日 下午4:31:13 
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
public class IframeOperate {

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
        driver.get("http://data.pharmacodia.com/web/homePage/index?ns=1&ts=1&str=YWSJ");    
        Thread.sleep(1000);  
        // 切换到某一个frame内部  
        driver.switchTo().frame("rightMain");  
        // 化学药 这个分类点击  
        WebElement drug_type_huaxue = driver.findElement(By.xpath("//*/span[@title='化学药']"));  
        drug_type_huaxue.click();  
        Thread.sleep(1000);  
        // 切换到Top Windows，点击权限提示上面的去登录按钮。  
        driver.switchTo().defaultContent();  
        driver.findElement(By.xpath("//*[@id='noLoginAlert']/div/button")).click();  
	}

}
