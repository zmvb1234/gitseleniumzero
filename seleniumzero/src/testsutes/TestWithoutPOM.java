/**
 * 
 */
package testsutes;
/** 
 * @author 
 * @version 创建时间：2017年10月10日 下午2:29:08 
 * 类说明 
 */
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
import org.testng.annotations.AfterClass;  
import org.testng.annotations.BeforeClass;  
import org.testng.annotations.Test; 
/**
 * @author Administrator
 *
 */
public class TestWithoutPOM 
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
        // 点击登录  
        driver.findElement(By.id("ttbar-login")).click();  
        // 点击账号登录  
        driver.findElement(By.xpath("//*/div[@class='login-form']/div[2]/a")).click();  
        // 输入用户名  
        driver.findElement(By.id("loginname")).sendKeys("user1");  
        // 输入密码  
        driver.findElement(By.id("nloginpwd")).sendKeys("password");  
        //点击登录  
        driver.findElement(By.id("loginsubmit")).click();      
    }  
      
    @AfterClass  
    public void tearDown()
    {  
        driver.quit();  
    }  
}
