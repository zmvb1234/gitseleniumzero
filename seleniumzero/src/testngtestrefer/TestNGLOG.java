/**
 * 
 */
package testngtestrefer;
/** 
 * @author 
 * @version ����ʱ�䣺2017��10��10�� ����10:06:05 
 * ��˵�� 
 */
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
import org.testng.Reporter;  
import org.testng.annotations.Test; 
/**
 * ����TestNG�е�Report����ʵ�ּ򵥵�log���:
 * ��TestNG����һ��Report���࣬�����������ǣ�
 * �������@Test�ķ������棬ͨ��Report.log("log message")�����ķ�ʽ��
 * ��ÿ�����������־���ͣ�
 * ��Щ��־���ͻ���ʾ��TestNG���ɵ�html�����С�
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
        Reporter.log("�˳������");    
     }  
}
