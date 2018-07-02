/**
 * 
 */
package driverfunction;
/** 
 * @author
 * @version 创建时间：2017年10月20日 下午2:34:55 
 * 类说明 
 */
/**
 * @author Administrator
 *
 */
import java.util.concurrent.TimeUnit;  

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.chrome.ChromeDriver;  
  
public class TestGetSource {  
    public static void main(String[] args) throws Exception {    
          
        System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");    
             
        WebDriver driver = new ChromeDriver();    
       
        driver.manage().window().maximize();    
         
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
            
        driver.get("https://www.baidu.com");    
         
        Thread.sleep(1000);  
         
        WebElement news_link = driver.findElement(By.linkText("新闻"));  
        news_link.click();  
        Thread.sleep(1000);  
        // 打印当前页面的源码  
        System.out.println(driver.getPageSource());  
         driver.quit();
    }    
}  
