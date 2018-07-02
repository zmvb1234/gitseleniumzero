/**
 * 
 */
package elementoperate;
/** 
 * @author 
 * @version ����ʱ�䣺2017��8��24�� ����2:14:06 
 * ��˵�� 
 */
import java.util.concurrent.TimeUnit;  

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver; 
/**
 * ��Ԫ���������ַ����͵���sendkeys()������������Ĳ�����һ�㶼��String����
 * ģ�������������Ԫ�ؾ͵���click()����������������û�з���ֵ��
 * click�������������DriverConmand���е�һ����������CLICK_ELEMENT,Ҳ���ǵ��Ԫ��
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
