/**
 * 
 */
package launchbrowser;
/** 
 * @author 
 * @version ����ʱ�䣺2017��11��20�� ����9:45:18 
 * ��˵�� 
 */
import java.util.concurrent.TimeUnit;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.firefox.FirefoxDriver;  
/**
 * @author Administrator
 *
 */
public class LaunchFirefox {
	 public static void main(String[] args) {  
          
	        System.setProperty("webdriver.gecko.driver", ".\\Tools\\geckodriver.exe");  
	          
	        //��ʼ��һ����������ʵ����ʵ�����ƽ�driver  
	        WebDriver driver = new FirefoxDriver();  
	        //��󻯴���  
	        driver.manage().window().maximize();  
	        //�������Եȴ�ʱ��  
	        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);  
	        // get()��һ��վ��  
	        driver.get("https://www.baidu.com");
	        //driver.get("http://localhost:8001/demo/demo.html");
	        //getTitle()��ȡ��ǰҳ��title��ֵ  
	        System.out.println("��ǰ��ҳ��ı����ǣ� "+ driver.getTitle());  
	        //�رղ��˳������  
	        driver.quit();  
	          
	    }  
}
