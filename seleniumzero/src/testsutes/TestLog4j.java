/**
 * 
 */
package testsutes;
/** 
 * @author 
 * @version ����ʱ�䣺2017��10��12�� ����9:44:30 
 * ��˵�� 
 */
import java.util.concurrent.TimeUnit;  
import org.apache.log4j.Logger;  
import org.apache.log4j.PropertyConfigurator;  
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver; 
/**
 * @author Administrator
 *
 */
public class TestLog4j 
{
	public static void main(String[] args) 
	{
	 Logger logger=Logger.getLogger("baidu");  
     PropertyConfigurator.configure(".\\Log4j.properties");  
     // �������  
     System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");    
     WebDriver driver = new ChromeDriver();   
     logger.info("���������");  
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
     logger.info("��ʽ�ȴ�10��");  
     driver.get("https://www.baidu.com");  
     logger.info("�򿪰ٶ���ҳ");  
     driver.findElement(By.id("kw")).sendKeys("Selenium");  
     logger.info("���������������selenium");
     driver.quit();
     logger.info("�ر������");
    }
}   
