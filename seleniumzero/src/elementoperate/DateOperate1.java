/**
 * 
 */
package elementoperate;
/** 
 * @author 
 * @version ����ʱ�䣺2017��9��12�� ����2:27:51 
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
        // ���������  
        WebElement date_inputbox = driver.findElement(By.id("datepicker"));  
        //��������������  
        date_inputbox.click();  
        // �����һ����  
        driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[@data-handler='next']")).click();  
        // ���17�գ�xpath��������е����Ԫ�أ�����ÿ��������һ�������Բ�һ������ľ���17��  
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[5]/a")).click();  
        Thread.sleep(2000);
        driver.quit();
	}

}
