/**
 * 
 */
package webdriverset;
/** 
 * @author 
 * @version ����ʱ�䣺2017��8��31�� ����3:03:47 
 * ��˵�� 
 */
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
import org.openqa.selenium.remote.CapabilityType;  
import org.openqa.selenium.remote.DesiredCapabilities;
/**
 * @author Administrator
 *
 */
public class NoSafe {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		// ����DesiredCapabilities���һ������ʵ��  
        DesiredCapabilities cap=DesiredCapabilities.chrome();  
        // ���ñ���ACCEPT_SSL_CERTS��ֵΪTrue  
        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);  
        System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");   
        // �򿪴�capability����ѡ��������  
        WebDriver driver=new ChromeDriver(cap);  
        driver.manage().window().maximize();  
        driver.get("https://kyfw.12306.cn/otn");  
        Thread.sleep(2000);
        driver.quit();
	}

}
