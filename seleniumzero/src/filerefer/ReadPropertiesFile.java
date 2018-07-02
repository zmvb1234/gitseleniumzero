/**
 * 
 */
package filerefer;
/** 
 * @author 
 * @version 创建时间：2017年9月22日 下午2:51:17 
 * 类说明 
 */
import java.io.FileInputStream;  
import java.io.IOException;  
import java.io.InputStream;  
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * @author Administrator
 *
 */
public class ReadPropertiesFile {

	/**
	 * @param args
	 */
	    public static String browser_Name;  
	    public static String server_Url; 
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
	    Properties p = new Properties();  
        InputStream ips = new FileInputStream(".\\TestConfig\\config.properties");  
        p.load(ips);  
        browser_Name=p.getProperty("browserName");  
        server_Url = p.getProperty("serverUrl");  
        System.out.println(browser_Name);  
        System.out.println(server_Url);  
        System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");    
        //初始化一个chrome浏览器实例，实例名称叫driver    
        WebDriver driver = new ChromeDriver();
        //最大化窗口    
        driver.manage().window().maximize();
       //设置隐性等待时间    
       driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);    
       // get()打开一个站点    
       //Navigation navigation =  driver.navigate();
	   //navigation.to(server_Url);
       driver.get(server_Url);
       ips.close();
       try {
		Thread.sleep(2000);
	       } 
       catch (InterruptedException e) 
       {
		// TODO Auto-generated catch block
		e.printStackTrace();
	   }
       driver.quit();
	}

}
