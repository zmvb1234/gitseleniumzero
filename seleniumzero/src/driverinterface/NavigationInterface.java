/**
 * 
 */
package driverinterface;
import java.util.concurrent.TimeUnit;    

import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
/** 
 * @author 
 * @version ����ʱ�䣺2017��8��24�� ����10:07:15 
 * ��˵�� 
 */
/**
 * driver.get("URL")-������Ӧ�ó���
 * element.sendKeys("inputtext")-�����ı������
 * element.clear()-	��������������
 * select.deselectAll()-�⽫ȡ��ѡ��ҳ���ϵĵ�һ��ѡ������ѡ��
 * select.selectByVisibleText("some text")
 * driver.switchTo().window("windowName")-
 * driver.switchTo().frame("frameName")-�ƶ���frame
 * driver.switchTo().alert()-�ƶ���alert
 * driver.navigate().to("URL")-�ƶ���URL
 * driver.navigate().forward()
 * driver.navigate().back()
 * driver.close()
 * driver.quit()
 * driver.refresh()	
 */
public class NavigationInterface 
{

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
        //driver.get("https://www.baidu.com"); 
         driver.navigate().to("http://www.baidu.com");
        Thread.sleep(5000);  
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);   
        // to(String url)�ڵ�ǰҳ���µ���ҳ  
        driver.navigate().to("http://news.baidu.com");  
        Thread.sleep(5000);  
        // back()���˵��ٶ���ҳ  
        driver.navigate().back();  
        Thread.sleep(5000);  
        // forward() ǰ�����ٶ�����  
        driver.navigate().forward();  
        Thread.sleep(5000);  
        // ˢ�µ�ǰҳ  
        driver.navigate().refresh();
        driver.close();
    }

}
