/**
 * 
 */
package testsutes;
/** 
 * @author 
 * @version 创建时间：2017年10月12日 上午10:14:28 
 * 类说明 
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
         Logger.Output(LogType.LogTypeName.INFO, "启动chrome浏览器");  
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
         Logger.Output(LogType.LogTypeName.INFO, "设置隐式时间10秒");  
         driver.get("https://www.baidu.com");  
         Logger.Output(LogType.LogTypeName.INFO, "打开百度首页");  
         driver.findElement(By.id("kw")).sendKeys("Selenium");  
         Logger.Output(LogType.LogTypeName.INFO, "搜索输入框输入关键字selenium"); 
         driver.quit();
         Logger.Output(LogType.LogTypeName.INFO, "关闭浏览器");          
	}

}
