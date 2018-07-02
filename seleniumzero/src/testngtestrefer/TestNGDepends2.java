/**
 * 
 */
package testngtestrefer;
/** 
 * @author 
 * @version 创建时间：2017年10月10日 上午10:51:27 
 * 类说明 
 */
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
import org.testng.annotations.AfterClass;  
import org.testng.annotations.BeforeClass;  
import org.testng.annotations.Test;
/**
 *写脚本的时候暂时不让一些测试用例执行，怎么办呢？
 *①代码注销这个用例区域
 *②第二个是去除前面@Test注释，这样testNG运行就不会运行到这部分的代码。
 *③testNG提供了一个enabled的参数，可以设置布尔型，true表示执行该方法，false表示不执行该用例。
 */
public class TestNGDepends2 
{
	 WebDriver driver;  
	 @BeforeClass  
	 public void setuo()
	 {   
	        System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");  
	        driver = new ChromeDriver();  
	        driver.manage().window().maximize();    
	 }  
	      
	    @Test  
	    public void openBaidu() throws InterruptedException
	    {  
	        driver.get("https://www.baidu.com");  
	        Thread.sleep(2000);  
	        System.out.println(driver.getTitle());  
	        //assertTrue(driver.getTitle() == "百度一下，你就知道");  
	    }  
	      
	    @Test(dependsOnMethods={"openBaidu"})  
	    public void testSearch() throws InterruptedException
	    {  
	        driver.findElement(By.id("kw")).sendKeys("Selenium");  
	        driver.findElement(By.id("su")).click();  
	        Thread.sleep(2000);  
	    }  
	      
	    @Test(enabled=false)  
	    public void testSearch2()
	    {  
	        driver.findElement(By.id("kw")).clear();  
	        driver.findElement(By.id("kw")).sendKeys("Selenium+Java");  
	        driver.findElement(By.id("su")).click();  
	    }  
	      
	    @AfterClass  
	    public void tearDown()
	    {  
	        driver.quit();  
	    }  
	
	
	
}
