/**
 * 
 */
package elementoperate;
/** 
 * @author 
 * @version ����ʱ�䣺2017��9��1�� ����11:14:53 
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
public class ElementDragAndDrop {

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
        driver.get("http://jqueryui.com/resources/demos/droppable/default.html");    
        Thread.sleep(2000);  
        // ��λ����ק��Ԫ��  
        WebElement move_ele = driver.findElement(By.id("draggable"));  
        // ��λ��קĿ��λ��Ԫ��  
        WebElement target_ele = driver.findElement(By.id("droppable"));   
        Actions action = new Actions(driver);  
        action.dragAndDrop(move_ele, target_ele).build().perform();  
        // ��֤��ק�ɹ�  
        assert(driver.findElement(By.xpath("//*[@id='droppable']/p[text()='Dropped!']")).isDisplayed() == true);
        Thread.sleep(2000);  
        driver.quit();
	}

}
