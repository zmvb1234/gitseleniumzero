/**
 * 
 */
package testsutes;
/** 
 * @author 
 * @version ����ʱ�䣺2017��10��12�� ����10:14:28 
 * ��˵�� 
 */
import java.util.concurrent.TimeUnit;  
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
import framework.LogType;  
import framework.Logger; 
/**
 * @author Administrator
 *
 */
public class TestJavaLog 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	     System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");    
         WebDriver driver = new ChromeDriver();   
         Logger.Output(LogType.LogTypeName.INFO, "����chrome�����");  
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
         Logger.Output(LogType.LogTypeName.INFO, "������ʽʱ��10��");  
         driver.get("https://www.baidu.com");  
         Logger.Output(LogType.LogTypeName.INFO, "�򿪰ٶ���ҳ");  
         driver.findElement(By.id("kw")).sendKeys("Selenium");  
         Logger.Output(LogType.LogTypeName.INFO, "�������������ؼ���selenium"); 
         driver.quit();
         Logger.Output(LogType.LogTypeName.INFO, "�ر������");          
	}

}
