/**
 * 
 */
package elementoperate;
/** 
 * @author 
 * @version 创建时间：2017年9月12日 下午2:27:51 
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
public class DateOperate1 {

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
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);     
        driver.get("http://jqueryui.com/resources/demos/datepicker/default.html");    
        Thread.sleep(2000);  
        // 日期输入框  
        WebElement date_inputbox = driver.findElement(By.id("datepicker"));  
        //鼠标点击日期输入框  
        date_inputbox.click();  
        // 点击下一个月  
        driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[@data-handler='next']")).click();  
        // 点击17日，xpath定义第三行第五个元素，可能每个月排序不一样，所以不一定点击的就是17日  
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[5]/a")).click();  
        Thread.sleep(2000);
        driver.quit();
	}

}
