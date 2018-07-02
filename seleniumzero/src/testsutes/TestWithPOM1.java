/**
 * 
 */
package testsutes;
/** 
 * @author 
 * @version 创建时间：2017年10月10日 下午3:02:26 
 * 类说明 
 */
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
import org.openqa.selenium.support.PageFactory;  
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;  
import org.testng.annotations.Test; 

import pageobjects.JdHomePage1;  
/**
 * @author Administrator
 *
 */
public class TestWithPOM1 
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
       JdHomePage1 hp = PageFactory.initElements(driver, JdHomePage1.class);  
       hp.login("user1", "123456");  
    } 
    
    @AfterClass  
    public void tearDown()
    {  
        driver.quit();  
    }
}
