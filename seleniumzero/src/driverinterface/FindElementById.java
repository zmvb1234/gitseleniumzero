/**
 * 
 */
package driverinterface;
/** 
 * @author 
 * @version ����ʱ�䣺2017��8��24�� ����10:53:13 
 * ��˵�� 
 */

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * 
 *
 */
public class FindElementById {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");  
        WebDriver driver = new ChromeDriver();   
        driver.get("https://www.baidu.com");  
        //By id ����Ԫ��  
        driver.findElement(By.id("kw")).sendKeys("Java");
        //driver.close();
        Thread.sleep(2000);
        driver.quit();
	}

}
