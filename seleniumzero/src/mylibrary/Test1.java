/**
 * 
 */
package mylibrary;
/** 
 * @author 
 * @version ����ʱ�䣺2017��9��28�� ����4:16:55 
 * ��˵�� 
 */
import java.util.concurrent.TimeUnit; 

import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  

import mylibrary.MyWait; 
/**
 * @author Administrator
 *
 */
public class Test1 {

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
        driver.get("https://www.icloud.com/");  
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);    
         // �û�������������ֶ�  
        driver.switchTo().frame("auth-frame");   
        MyWait.isElementPresent(driver, ".//*[@id='appleId']", 10).sendKeys("tester");  
        // ��������������ֶ�  
        MyWait.isElementPresent(driver, ".//*[@id='pwd']", 10).sendKeys("123456");  
        Thread.sleep(2000);
        System.out.println("123456");
		driver.quit();
	}

}
