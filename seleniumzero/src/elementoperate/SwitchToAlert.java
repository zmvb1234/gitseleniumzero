/**
 * 
 */
package elementoperate;
/** 
 * @author 
 * @version ����ʱ�䣺2017��8��28�� ����2:42:29 
 * ��˵�� 
 */
import java.util.concurrent.TimeUnit;    
import org.openqa.selenium.WebDriver;   
import org.openqa.selenium.chrome.ChromeDriver; 
/**
 * @author Administrator
 *
 */
public class SwitchToAlert {

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
	     driver.get("http://news.cyol.com/node_60799.htm");    
	     Thread.sleep(2000);
	     // ����alert��  
	     System.out.println(driver.switchTo().alert().getText());  
	     driver.switchTo().alert().accept();
	     driver.quit();
	     /**dismiss()���ǵ��alert�������ȡ����ť��
	      * getText()���ǻ�ȡalert�ڲ������֣����������ӡЧ����
	      */
	     

	}

}
