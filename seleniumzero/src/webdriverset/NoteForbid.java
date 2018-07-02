/**
 * 
 */
package webdriverset;
/** 
 * @author 
 * @version 创建时间：2017年9月12日 下午4:48:49 
 * 类说明 
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
        // 创建HashMap类的一个对象  
        Map<String, Object> prefs = new HashMap<String, Object>();  
        // 设置提醒的设置，2表示block  
        prefs.put("profile.default_content_setting_values.notifications", 2);  
        ChromeOptions options = new ChromeOptions();  
        options.setExperimentalOption("prefs", prefs);  
        // 在 Chrome driver传入options设置  
        WebDriver driver = new ChromeDriver(options);  
        driver.get("http://scrolltest.com/");  
        driver.manage().window().maximize(); 
        driver.quit();

	}

}
