/**
 * 
 */
package keyboardoperate;
/** 
 * @author 
 * @version ����ʱ�䣺2017��9��12�� ����3:06:16 
 * ��˵�� 
 */
import org.openqa.selenium.By;  
import org.openqa.selenium.Keys;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.firefox.FirefoxDriver; 
/**
 * @author Administrator
 *Keys������µ�һЩ������ ��ƪ����һЩ��ϲ�����
 *����Ctrl+A��ʾȫѡ��Alt+t��ʾ�¿�һ�������tab��
 */
public class KeyCombination {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver", ".\\Tools\\geckodriver.exe");  
	     WebDriver driver = new FirefoxDriver();   
	     driver.get("http://news.baidu.com/"); 
	     driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, "a"));  
	     Thread.sleep(2);  
	     driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, "t"));  
	     Thread.sleep(2);
	     driver.quit();
	}

}
