/**
 * 
 */
package elementoperate;
/** 
 * @author 
 * @version 创建时间：2017年9月1日 上午11:14:53 
 * 类说明 
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
        // 定位能拖拽的元素  
        WebElement move_ele = driver.findElement(By.id("draggable"));  
        // 定位拖拽目标位置元素  
        WebElement target_ele = driver.findElement(By.id("droppable"));   
        Actions action = new Actions(driver);  
        action.dragAndDrop(move_ele, target_ele).build().perform();  
        // 验证拖拽成功  
        assert(driver.findElement(By.xpath("//*[@id='droppable']/p[text()='Dropped!']")).isDisplayed() == true);
        Thread.sleep(2000);  
        driver.quit();
	}

}
