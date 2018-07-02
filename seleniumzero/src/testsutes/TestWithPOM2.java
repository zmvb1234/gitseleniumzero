/**
 * 
 */
package testsutes;
/** 
 * @author 
 * @version 创建时间：2017年10月11日 上午10:17:13 
 * 类说明 
 */
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;  
import org.testng.annotations.Test;   
import pageobjects.JdHomePage2;
/**
 * @author Administrator
 *
 */
public class TestWithPOM2 
{
	    WebDriver driver;  
	    @BeforeClass  
	    public void setUp() throws Exception
	    {  
	        System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");    
	        driver = new ChromeDriver();    
	        driver.manage().window().maximize();    
	        driver.get("https://www.jd.com/");    
	        Thread.sleep(2000);    
	    }  
	    @Test  
	    public void testLogin()
	    {  
	        JdHomePage2 hp = new JdHomePage2(driver);  
	        hp.clickLoginLink();  
	        hp.inputPassword("user1");  
	        hp.inputUsername("123456");  
	        hp.clickLoginBtn();  
	    }  
	    @AfterClass  
	    public void tearDown()
	    {  
	        driver.quit();  
	    }
	
}
