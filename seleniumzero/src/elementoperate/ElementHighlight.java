/**
 * 
 */
package elementoperate;
/** 
 * @author 
 * @version ����ʱ�䣺2017��8��28�� ����2:49:59 
 * ��˵�� 
 */
import java.util.concurrent.TimeUnit;  

import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * @author Administrator
 *
 */
public class ElementHighlight {

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
        // �����¼  
        driver.findElement(By.xpath("//*[@id='u1']/a[7]")).click();  
        Thread.sleep(500);  
        WebElement username = driver.findElement(By.id("TANGRAM__PSP_10__userName"));  
        // ����һ��JavascriptExecutor����  
        JavascriptExecutor js= (JavascriptExecutor)driver;  
        username.sendKeys("abcdefg");  
        // ������ɫ  
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",username);  
        WebElement password = driver.findElement(By.id("TANGRAM__PSP_10__password"));
        password.sendKeys("1234");
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",password); 
        driver.quit();
	}

}
