/**
 * 
 */
package launchbrowser;
import java.util.concurrent.TimeUnit;    
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.ie.InternetExplorerDriver; 
/** 
 * @author
 * @version ����ʱ�䣺2017��8��23�� ����7:16:05 
 * ��˵�� 
 */
/**
 * @author Administrator
 *
 */
public class LaunchIE {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", ".\\Tools\\IEDriverServer.exe");    
        //��ʼ��һ��IE�����ʵ����ʵ�����ƽ�driver    
        WebDriver driver = new  InternetExplorerDriver();   
        //��󻯴���    
        driver.manage().window().maximize();    
        //�������Եȴ�ʱ��    
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);    
        // get()��һ��վ��    
        driver.get("https://www.baidu.com");    
        //getTitle()��ȡ��ǰҳ��title��ֵ    
        System.out.println("��ǰ��ҳ��ı����ǣ� "+ driver.getTitle());     
        //�رղ��˳������    
        driver.quit();    
            
	}

}
