/**
 * 
 */
package webdriverset;
/** 
 * @author 
 * @version ����ʱ�䣺2017��9��12�� ����4:48:49 
 * ��˵�� 
 */
import java.util.HashMap;  
import java.util.Map;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
import org.openqa.selenium.chrome.ChromeOptions;
/**
 * @author Administrator
 *
 */
public class NoteForbid {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");  
        // ����HashMap���һ������  
        Map<String, Object> prefs = new HashMap<String, Object>();  
        // �������ѵ����ã�2��ʾblock  
        prefs.put("profile.default_content_setting_values.notifications", 2);  
        ChromeOptions options = new ChromeOptions();  
        options.setExperimentalOption("prefs", prefs);  
        // �� Chrome driver����options����  
        WebDriver driver = new ChromeDriver(options);  
        driver.get("http://scrolltest.com/");  
        driver.manage().window().maximize(); 
        driver.quit();

	}

}
