/**
 * 
 */
package testngtestrefer;
/** 
 * @author 
 * @version 创建时间：2017年10月10日 上午10:31:55 
 * 类说明 
 */ 
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
import org.testng.annotations.AfterClass;  
import org.testng.annotations.BeforeClass;  
import org.testng.annotations.Test; 
/**
 * TestNG中一个类中有多个测试方法的时候，多个测试方法的执行顺序或者依赖关系的问题。
 * 如果不用dependsOnMethods,testNG会自动根据@Test方法名称的首字母排序来执行测试方法。
 *
 */
public class TestNGDepends1 
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
	    
	    @Test(dependsOnMethods={"testSearch"})  
	    public void testSearch2() throws InterruptedException
	    {  
	        driver.findElement(By.id("kw")).clear();  
	        driver.findElement(By.id("kw")).sendKeys("Selenium+Java");  
	        driver.findElement(By.id("su")).click();  
	        Thread.sleep(2000);
	    } 
	    
	    @AfterClass  
	    public void tearDown()
	    {  
	        driver.quit();  
	    }  
}
