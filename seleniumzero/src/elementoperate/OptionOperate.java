/**
 * 
 */
package elementoperate;
/** 
 * @author 
 * @version ����ʱ�䣺2017��9��12�� ����2:35:44 
 * ��˵�� 
 */
import java.util.List;  
import java.util.concurrent.TimeUnit;  

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.chrome.ChromeDriver;  
/**
 * @author Administrator
 *
 */
public class OptionOperate {

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
	        driver.get("http://jqueryui.com/resources/demos/selectmenu/default.html");    
	        Thread.sleep(2000);  
	        // ���ѡ���ٶ���������˵�  
	        driver.findElement(By.xpath("//*[@id='speed-button']")).click();  
	        // һ���ڵ������е�optionѡ��  
	        List<WebElement> list = driver.findElements(By.xpath("//*[@id='speed-menu']/li/div"));  
	        for (WebElement ele : list)
	        {  
	        
	            if(ele.getAttribute("innerHTML").equals("Fast"))
	            {  
	                ele.click();  
	                break;  
	            }  
	        } 
	        Thread.sleep(2000);
	        driver.quit();

	}

}
