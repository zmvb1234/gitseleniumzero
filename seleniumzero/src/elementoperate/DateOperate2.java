/**
 * 
 */
package elementoperate;
/** 
 * @author 
 * @version ����ʱ�䣺2017��9��12�� ����2:31:28 
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
public class DateOperate2 {

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
	        driver.get("http://jqueryui.com/resources/demos/datepicker/default.html");    
	        Thread.sleep(2000);  
	        // ���������  
	        WebElement date_inputbox = driver.findElement(By.id("datepicker"));  
	        date_inputbox.sendKeys("08/17/2017");
	        Thread.sleep(2000); 
	        driver.quit();

	}

}
