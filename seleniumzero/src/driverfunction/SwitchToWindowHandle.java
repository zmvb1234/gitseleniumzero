/**
 * 
 */
package driverfunction;
/** 
 * @author 
 * @version ����ʱ�䣺2017��8��24�� ����3:39:42 
 * ��˵�� 
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
public class SwitchToWindowHandle {

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
	     driver.get("https://www.jd.com/");     
	     Thread.sleep(1000);   
	     //����������˵��е� �ֻ�  
	     WebElement phone_link = driver.findElement(By.linkText("�ֻ�"));  
	     phone_link.click();  
	     Thread.sleep(1000);  
	     // ��ȡ��ǰҳ����    
	      String handle = driver.getWindowHandle();    
	     // ��ȡ����ҳ��ľ������ѭ���жϲ��ǵ�ǰ�ľ��   
	     for (String temhandle : driver.getWindowHandles()) 
	     {    
	        if (!temhandle.equals(handle)) 
	        {
	                driver.close();  
	                driver.switchTo().window(temhandle); 
	        }
	             
	        }    
	        WebElement xiaomi_link = driver.findElement(By.linkText("С��"));  
	        xiaomi_link.click();  
	        Thread.sleep(5000);
	        driver.quit();
	          
	}

}
