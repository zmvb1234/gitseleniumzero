package testngtestrefer;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  

/**
 * 
 * BeforeClass中写启动浏览器脚本。
 * 在AfterClass中写退出浏览器代码，在@Test中写我们测试脚本。
 * 所有有关测试脚本，都需要写到@Test下的方法
 * 这个函数或者方法是关于测试脚本的，那么你就要在该方法前面加上@Test这个注释，可以添加多个@Test的测试函数。
 * 
 * 
 
 *
 */
public class FirstTestNGTest 
{
	WebDriver driver;  
	@Test
  public void f() 
  {
   driver.get("https://www.baidu.com");  
   driver.findElement(By.id("kw")).sendKeys("Selenium");  
   driver.findElement(By.id("su")).click(); 
  }
  @BeforeClass
  public void beforeClass() 
  {
	    System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");  
        driver = new ChromeDriver();  
        driver.manage().window().maximize();
  }
  @AfterClass
  public void afterClass() 
  {
	  driver.quit();  
  }

}
