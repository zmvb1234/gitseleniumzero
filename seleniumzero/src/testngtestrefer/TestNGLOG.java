/**
 * 
 */
package testngtestrefer;
/** 
 * @author 
 * @version 创建时间：2017年10月10日 上午10:06:05 
 * 类说明 
 */
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
import org.testng.Reporter;  
import org.testng.annotations.Test; 
/**
 * 利用TestNG中的Report类来实现简单的log输出:
 * 在TestNG中有一个Report的类，这个类的作用是，
 * 在添加了@Test的方法里面，通过Report.log("log message")这样的方式，
 * 给每个步骤添加日志解释，
 * 这些日志解释会显示在TestNG生成的html报告中。
 *
 */
public class TestNGLOG 
{
	@Test  
    public void testReport()
	{   
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();    
        Reporter.log("launch chrome browser instance"); 
        driver.manage().window().maximize();  
        Reporter.log("Max the browser");    
        driver.get("https://www.baidu.com");     
        Reporter.log("open baidu site");      
        driver.quit();   
        Reporter.log("退出浏览器");    
     }  
}
