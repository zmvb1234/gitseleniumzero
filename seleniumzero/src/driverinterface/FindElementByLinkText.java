/**
 * 
 */
package driverinterface;
/** 
 * @author 
 * @version 创建时间：2017年8月24日 上午11:30:41 
 * 类说明 
 */
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver; 
/**
 * linktext呢，就是我们在网页上看到有一个链接，上面有一个文字描述,
 * 当我们点击这个文字，就可以跳转到其他页面。
 *
 */
public class FindElementByLinkText {

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
        driver.get("https://www.baidu.com");  
        //By linkText 查找元素  
        driver.findElement(By.linkText("新闻")).click();  
        Thread.sleep(1000);  
        //判断打开页面是不是百度新闻，这里用url作为验证  
        assert driver.getCurrentUrl() == "http://news.baidu.com"; 
        Thread.sleep(1000); 
        driver.quit();
	}

}
