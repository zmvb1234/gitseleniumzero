/**
 * 
 */
package elementoperate;
/** 
 * @author 
 * @version 创建时间：2017年8月28日 下午2:42:29 
 * 类说明 
 */
import java.util.concurrent.TimeUnit;    
import org.openqa.selenium.WebDriver;   
import org.openqa.selenium.chrome.ChromeDriver; 
/**
 * @author Administrator
 *
 */
public class SwitchToAlert {

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
	     driver.get("http://news.cyol.com/node_60799.htm");    
	     Thread.sleep(2000);
	     // 处理alert框  
	     System.out.println(driver.switchTo().alert().getText());  
	     driver.switchTo().alert().accept();
	     driver.quit();
	     /**dismiss()就是点击alert框上面的取消按钮，
	      * getText()就是获取alert内部的文字，例如上面打印效果。
	      */
	     

	}

}
