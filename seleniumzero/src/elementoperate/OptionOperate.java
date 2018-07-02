/**
 * 
 */
package elementoperate;
/** 
 * @author 
 * @version 创建时间：2017年9月12日 下午2:35:44 
 * 类说明 
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
	        // 点击选中速度这个下拉菜单  
	        driver.findElement(By.xpath("//*[@id='speed-button']")).click();  
	        // 一个节点下所有的option选项  
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
