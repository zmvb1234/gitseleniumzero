/**
 * 
 */
package keyboardoperate;
/** 
 * @author 
 * @version 创建时间：2017年9月12日 下午3:06:16 
 * 类说明 
 */
import org.openqa.selenium.By;  
import org.openqa.selenium.Keys;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.firefox.FirefoxDriver; 
/**
 * @author Administrator
 *Keys这个类下的一些操作， 这篇介绍一些组合操作。
 *例如Ctrl+A表示全选，Alt+t表示新开一个浏览器tab。
 */
public class KeyCombination {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver", ".\\Tools\\geckodriver.exe");  
	     WebDriver driver = new FirefoxDriver();   
	     driver.get("http://news.baidu.com/"); 
	     driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, "a"));  
	     Thread.sleep(2);  
	     driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, "t"));  
	     Thread.sleep(2);
	     driver.quit();
	}

}
