/**
 * 
 */
package elementoperate;
/** 
 * @author 
 * @version ����ʱ�䣺2017��8��28�� ����5:27:20 
 * ��˵�� 
 */
import java.util.concurrent.TimeUnit;  

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.chrome.ChromeDriver;  
import org.openqa.selenium.interactions.Actions; 
/**
 * @author Administrator
 *
 */
public class ActionMoveToElement {

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
        driver.get("https://www.baidu.com/");    
        Thread.sleep(2000); 
        // ����  
        WebElement settings = driver.findElement(By.xpath("//*[@id='u1']/a[8]"));  
        Actions action = new Actions(driver);  
        action.moveToElement(settings).perform();  
        driver.findElement(By.linkText("�߼�����")).click();  
        Thread.sleep(2000);
        driver.quit();
	}

}
