/**
 * 
 */
package driverinterface;
/** 
 * @author 
 * @version ����ʱ�䣺2017��8��24�� ����1:57:34 
 * ��˵�� 
 */
import java.util.List;  
import java.util.concurrent.TimeUnit;  
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * findElements�ӿ���Ҳ�а��ַ��������ﲻһһ������
 * ����������õ��˼��Ϻ�forѭ��������Ϥ�Ŀ�����ȥ�˽�һ�¡�
 */
public class FindElementsTEST {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");    
	     WebDriver driver = new ChromeDriver();    
	     driver.manage().window().maximize();     
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);      
	     driver.get("https://news.baidu.com");      
	     List <WebElement> links = driver.findElements(By.xpath(".//*[@id='pane-news']/ul[1]/li/a"));   
	    for(int i=0; i<links.size(); i++)
	    {  
	            System.out.println(links.get(i).getText());  
	    }
	    driver.quit();
	}
}
