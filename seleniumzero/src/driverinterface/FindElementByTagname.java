/**
 * 
 */
package driverinterface;
/** 
 * @author 
 * @version ����ʱ�䣺2017��8��24�� ����1:47:51 
 * ��˵�� 
 */
import java.util.concurrent.TimeUnit;  
import org.openqa.selenium.By;  
import org.openqa.selenium.Keys;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * �鿴��ҳԪ�ص�ʱ��ȫ�ǿ�ʼ��input ����button,div,label�ȵȣ���Щ��ǩ�ͽ�tagname��
 * һ������tagname��λԪ�ػ���ֺܶ��Ԫ�أ�������һ��Ψһ��Ԫ�أ�����tagname����
 *
 */
public class FindElementByTagname {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", ".\\Tools\\geckodriver.exe");    
        WebDriver driver = new FirefoxDriver();   
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);    
        driver.get("http://news.baidu.com");    
        driver.findElement(By.tagName("body")).sendKeys(Keys.F11);
        driver.quit();
	}

}
