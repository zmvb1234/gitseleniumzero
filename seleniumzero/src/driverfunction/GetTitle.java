/**
 * 
 */
package driverfunction;
/** 
 * @author
 * @version ����ʱ�䣺2017��8��24�� ����3:15:17 
 * ��˵�� 
 */
import java.util.concurrent.TimeUnit;    
import org.openqa.selenium.WebDriver;   
import org.openqa.selenium.chrome.ChromeDriver;
/**
 *driver.getTitle()
 *��Ҫ�������жϣ����ǵ�ǰҳ�򿪵��ǲ�����ȷ��
 */
public class GetTitle {

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
	        driver.get("https://www.baidu.com");    
	        Thread.sleep(200);  
	        String title = driver.getTitle();  
	        System.out.println(title);  
	        assert title =="�ٶ�һ�£����֪��";  
	        // ��������д����  
	        assert title.equals("�ٶ�һ�£����֪��"); 
	        driver.quit();
	}

}
