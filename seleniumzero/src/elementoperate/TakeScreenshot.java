/**
 * 
 */
package elementoperate;
/** 
 * @author 
 * @version ����ʱ�䣺2017��8��31�� ����2:46:08 
 * ��˵�� 
 */
import java.io.File;  
import java.io.IOException;  
import java.util.concurrent.TimeUnit;  
import org.apache.commons.io.FileUtils;  
import org.openqa.selenium.OutputType;  
import org.openqa.selenium.TakesScreenshot;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver; 
/**
 * @author Administrator
 * TakeScreenshot������ͼ���õ���ͼƬ������������ڵĽ�ͼ��
 */
public class TakeScreenshot {

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
        driver.get("https://www.baidu.com");    
        Thread.sleep(1000);  
        // ���ý�ͼ����  
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  
        try 
        {  
            // ������ͼ�ļ���������Ŀ./Screenshots  
            FileUtils.copyFile(src, new File(".\\Screenshots\\screen.png"));  
        }  
           
       catch (IOException e)  
         {  
            System.out.println(e.getMessage());  
           
         }  
        driver.quit();
	}

}
