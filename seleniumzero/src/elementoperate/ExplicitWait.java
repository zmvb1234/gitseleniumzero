/**
 * 
 */
package elementoperate;
/** 
 * @author 
 * @version 创建时间：2017年9月12日 下午4:23:06 
 * 类说明 
 */
import java.util.concurrent.TimeUnit;  
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.firefox.FirefoxDriver;  
import org.openqa.selenium.support.ui.ExpectedConditions;  
import org.openqa.selenium.support.ui.WebDriverWait; 
/**
 *implicitlyWait主要作用是只会检查页面元素展示的元素是否显示，如果该元素没有显示就会报错，提示该元素不可见。
 *而Explicit wait就是设置一个最大时间的，如果超过这个时间，也会报错。
 *
 */
public class ExplicitWait {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", ".\\Tools\\geckodriver.exe");    
        WebDriver driver = new FirefoxDriver();        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   
        driver.get("https://www.icloud.com/");    
        // 创建一个WebDriverWait类的一个对象 wait，设置5，默认单位是秒  
        WebDriverWait wait=new WebDriverWait(driver,5);   
        // 等待知道5秒之后该元素还是不可见，就报错。  
        driver.switchTo().frame("auth-frame");  
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='appleId']")));  
        boolean status = element.isDisplayed(); 
        // 判断  
        if (status) 
        {  
            System.out.println("===== 元素可见======");  
        } 
        else 
        {  
            System.out.println("===== 元素不可见======");  
        }  
        driver.quit();
	}

}
