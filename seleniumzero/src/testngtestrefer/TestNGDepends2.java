/**
 * 
 */
package testngtestrefer;
/** 
 * @author 
 * @version ����ʱ�䣺2017��10��10�� ����10:51:27 
 * ��˵�� 
 */
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
import org.testng.annotations.AfterClass;  
import org.testng.annotations.BeforeClass;  
import org.testng.annotations.Test;
/**
 *д�ű���ʱ����ʱ����һЩ��������ִ�У���ô���أ�
 *�ٴ���ע�������������
 *�ڵڶ�����ȥ��ǰ��@Testע�ͣ�����testNG���оͲ������е��ⲿ�ֵĴ��롣
 *��testNG�ṩ��һ��enabled�Ĳ������������ò����ͣ�true��ʾִ�и÷�����false��ʾ��ִ�и�������
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
	        //assertTrue(driver.getTitle() == "�ٶ�һ�£����֪��");  
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
