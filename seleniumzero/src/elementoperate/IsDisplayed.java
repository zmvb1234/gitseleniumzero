/**
 * 
 */
package elementoperate;
/** 
 * @author 
 * @version ����ʱ�䣺2017��8��28�� ����2:07:50 
 * ��˵�� 
 */
import java.util.concurrent.TimeUnit;  
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.chrome.ChromeDriver; 
/**
 * @author Administrator
 *
 */
public class IsDisplayed {

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
        Thread.sleep(1000);  
        // �����¼  
        driver.findElement(By.xpath("//*[@id='u1']/a[7]")).click();  
        // ��¼�������û���������  
        driver.findElement(By.id("TANGRAM__PSP_10__userName")).sendKeys("abc");  
        driver.findElement(By.id("TANGRAM__PSP_10__password")).sendKeys("123456");  
        driver.findElement(By.id("TANGRAM__PSP_10__submitWrapper")).click();  
        Thread.sleep(2000);  
        //  
        WebElement error_message = driver.findElement(By.xpath("//*[@id='TANGRAM__PSP_10__error' and text()='��������֤��']"));  
        assert error_message.isDisplayed();
        driver.quit();
	}

}
