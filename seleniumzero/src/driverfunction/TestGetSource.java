/**
 * 
 */
package driverfunction;
/** 
 * @author
 * @version ����ʱ�䣺2017��10��20�� ����2:34:55 
 * ��˵�� 
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
         
        WebElement news_link = driver.findElement(By.linkText("����"));  
        news_link.click();  
        Thread.sleep(1000);  
        // ��ӡ��ǰҳ���Դ��  
        System.out.println(driver.getPageSource());  
         driver.quit();
    }    
}  
