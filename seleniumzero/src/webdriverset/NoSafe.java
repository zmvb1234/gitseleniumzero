/**
 * 
 */
package webdriverset;
/** 
 * @author 
 * @version 创建时间：2017年8月31日 下午3:03:47 
 * 类说明 
 */
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
import org.openqa.selenium.remote.CapabilityType;  
import org.openqa.selenium.remote.DesiredCapabilities;
/**
 * @author Administrator
 *
 */
public class NoSafe {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		// 创建DesiredCapabilities类的一个对象实例  
        DesiredCapabilities cap=DesiredCapabilities.chrome();  
        // 设置变量ACCEPT_SSL_CERTS的值为True  
        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);  
        System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");   
        // 打开带capability设置选项的浏览器  
        WebDriver driver=new ChromeDriver(cap);  
        driver.manage().window().maximize();  
        driver.get("https://kyfw.12306.cn/otn");  
        Thread.sleep(2000);
        driver.quit();
	}

}
