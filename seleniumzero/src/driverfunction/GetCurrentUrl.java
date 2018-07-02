/**
 * 
 */
package driverfunction;
/** 
 * @author 
 * @version ����ʱ�䣺2017��8��24�� ����3:20:14 
 * ��˵�� 
 */
/**
 *getCurrentUrl()
 *���صĵ�ǰdriver��ͣ���ڵĵ�ǰҳ��url��
 *
 */
import java.util.concurrent.TimeUnit;  

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.chrome.ChromeDriver;
public class GetCurrentUrl 
{

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
        Thread.sleep(2000);  
        String title = driver.getTitle();  
        System.out.println(title);  
        WebElement news_link = driver.findElement(By.linkText("����"));  
        news_link.click();  
        Thread.sleep(1000);  
        String current_url = driver.getCurrentUrl();  
        assert current_url == "http://news.baidu.com"; 
        driver.close();
        //driver.quit();
	}

}
