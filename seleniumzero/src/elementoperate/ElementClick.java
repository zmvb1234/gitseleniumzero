/**
 * 
 */
package elementoperate;
/** 
 * @author 
 * @version 创建时间：2017年8月24日 下午2:14:06 
 * 类说明 
 */
import java.util.concurrent.TimeUnit;  

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver; 
/**
 * 给元素上输入字符，就调用sendkeys()方法这个方法的参数，一般都是String类型
 * 模拟鼠标左键，点击元素就调用click()方法，这两个方法没有返回值。
 * click方法里面调用了DriverConmand类中的一个方法，叫CLICK_ELEMENT,也就是点击元素
 */
public class ElementClick {

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
        driver.get("https://www.baidu.com");    
        driver.findElement(By.id("kw")).sendKeys("Selenium");  
        driver.findElement(By.id("su")).click();
        Thread.sleep(2000);
        driver.quit();
	}

}
