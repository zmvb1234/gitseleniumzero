/**
 * 
 */
package driverfunction;
/** 
 * @author 
 * @version ����ʱ�䣺2017��8��24�� ����4:31:13 
 * ��˵�� 
 */
import java.util.concurrent.TimeUnit;  

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.chrome.ChromeDriver; 
/**
 * @author Administrator
 *
 */
public class IframeOperate {

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
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);   
        driver.get("http://data.pharmacodia.com/web/homePage/index?ns=1&ts=1&str=YWSJ");    
        Thread.sleep(1000);  
        // �л���ĳһ��frame�ڲ�  
        driver.switchTo().frame("rightMain");  
        // ��ѧҩ ���������  
        WebElement drug_type_huaxue = driver.findElement(By.xpath("//*/span[@title='��ѧҩ']"));  
        drug_type_huaxue.click();  
        Thread.sleep(1000);  
        // �л���Top Windows�����Ȩ����ʾ�����ȥ��¼��ť��  
        driver.switchTo().defaultContent();  
        driver.findElement(By.xpath("//*[@id='noLoginAlert']/div/button")).click();  
	}

}
