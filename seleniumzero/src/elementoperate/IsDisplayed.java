/**
 * 
 */
package elementoperate;
/** 
 * @author 
 * @version 创建时间：2017年8月28日 下午2:07:50 
 * 类说明 
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
        // 点击登录  
        driver.findElement(By.xpath("//*[@id='u1']/a[7]")).click();  
        // 登录中输入用户名和密码  
        driver.findElement(By.id("TANGRAM__PSP_10__userName")).sendKeys("abc");  
        driver.findElement(By.id("TANGRAM__PSP_10__password")).sendKeys("123456");  
        driver.findElement(By.id("TANGRAM__PSP_10__submitWrapper")).click();  
        Thread.sleep(2000);  
        //  
        WebElement error_message = driver.findElement(By.xpath("//*[@id='TANGRAM__PSP_10__error' and text()='请输入验证码']"));  
        assert error_message.isDisplayed();
        driver.quit();
	}

}
