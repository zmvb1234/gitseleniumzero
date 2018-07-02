/**
 * 
 */
package driverinterface;
/** 
 * @author
 * @version ����ʱ�䣺2017��8��24�� ����1:42:51 
 * ��˵�� 
 */
import java.util.concurrent.TimeUnit;  

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * ��̬��ҳ��Ҫʹ��HTML����.��̬Ч����һ��ʹ��CSS����JavaScpirt.
 * �������е�H5ǰ�˿�����Ҳ��HTML5+CSS+JavaScript
 *
 */
public class FindElementByCSS {

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
        driver.findElement(By.cssSelector("#kw")).sendKeys("Java"); 
        driver.findElement(By.cssSelector("#su")).click();  
        Thread.sleep(2000);
        //�رղ��˳������    
        driver.quit();
	}

}
