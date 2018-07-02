/**
 * 
 */
package elementoperate;
/** 
 * @author 
 * @version 创建时间：2017年8月31日 下午2:46:08 
 * 类说明 
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
 * TakeScreenshot类来截图，得到的图片是浏览器窗口内的截图。
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
        // 调用截图方法  
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  
        try 
        {  
            // 拷贝截图文件到我们项目./Screenshots  
            FileUtils.copyFile(src, new File(".\\Screenshots\\screen.png"));  
        }  
           
       catch (IOException e)  
         {  
            System.out.println(e.getMessage());  
           
         }  
        driver.quit();
	}

}
