/**
 * 
 */
package testngtestrefer;
/** 
 * @author 
 * @version ����ʱ�䣺2017��9��30�� ����2:09:30 
 * ��˵�� 
 */
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;  
import org.testng.annotations.Parameters;  
import org.testng.annotations.Test; 
/**
 * @author Administrator
 *
 */
public class TestCrossBrowser {

	/**
	 *  @Factory ������������һ���������������뷵�ص���һ������
	 *  @Listeners ��һ�����Է����϶���һ������������Selenium�Զ�����������Ҫ�õ�����¼��������ܣ��������������־��
	 * 
	 */
	
	     // ����@Testһ��Ҫд�������д����ʾ��ǰû����Ҫִ�еĽű���
	     //����Բ��Բ�д��Ȼ��run testng.xml���Կ����ᷢ��ʲô
	     @Test    
		 @Parameters("Browser")  //��һ���������ݲ���
	public void startBrowser (String Browser) throws InterruptedException
		 {  
		        if(Browser.equalsIgnoreCase("Firefox"))
		        {  
		            System.setProperty("webdriver.gecko.driver", ".\\Tools\\geckodriver.exe");  
		            WebDriver driver = new FirefoxDriver();
		            //driver.manage().window().maximize();  
		            driver.get("https://www.baidu.com");
		            Thread.sleep(3000);
		            driver.quit();  
		        }  
		        else if(Browser.equalsIgnoreCase("Chrome"))
		        {  
		            System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");  
		            WebDriver driver = new ChromeDriver();  
		            driver.manage().window().maximize();  
		            driver.get("https://www.baidu.com");
		            Thread.sleep(3000);
		            driver.quit();  
		        }  
		
		 }
	

}