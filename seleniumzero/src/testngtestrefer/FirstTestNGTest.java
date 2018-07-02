package testngtestrefer;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  

/**
 * 
 * BeforeClass��д����������ű���
 * ��AfterClass��д�˳���������룬��@Test��д���ǲ��Խű���
 * �����йز��Խű�������Ҫд��@Test�µķ���
 * ����������߷����ǹ��ڲ��Խű��ģ���ô���Ҫ�ڸ÷���ǰ�����@Test���ע�ͣ�������Ӷ��@Test�Ĳ��Ժ�����
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
