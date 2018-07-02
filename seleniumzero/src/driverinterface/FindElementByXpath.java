/**
 * 
 */
package driverinterface;
/** 
 * @author 
 * @version ����ʱ�䣺2017��8��24�� ����11:20:08 
 * ��˵�� 
 */
import java.util.concurrent.TimeUnit;  
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver; 
/**
 * XPathһ����ʵ���Զ���������Ŀ���õ��Ƚ϶࣬��Ȼ��8��Ԫ�ض�λ����.
 * ����XPath���д�����ˣ������Ͽ�����XPath��ɰٷ�֮95���ϵ�Ԫ�ض�λ��
 *
 */
public class FindElementByXpath {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");    
        WebDriver driver = new ChromeDriver();    
        driver.manage().window().maximize();      
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);       
        driver.get("https://www.baidu.com");    
        driver.findElement(By.xpath(".//*[@id='kw']")).sendKeys("Java");  
        driver.findElement(By.xpath(".//*[@id='su']")).click();
        //�ٶ����������:
        //*/input[@id='kw']
       //*/input[@name='wd']
       //*/input[@class='s_ipt']
       //�����ύ��ť��
       //*/input[@id='su']
       //*/input[@value='�ٶ�һ��']
       //*/input[@class='bg s_btn']
        Thread.sleep(2000);
        //�رղ��˳������    
        driver.quit();    
	}

}
