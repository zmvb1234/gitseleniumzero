/**
 * 
 */
package assertsplittest;
/** 
 * @author 
 * @version 创建时间：2017年9月30日 上午9:43:56 
 * 类说明 
 */
import java.util.concurrent.TimeUnit;  
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.chrome.ChromeDriver; 
/**
 * @author Administrator
 *
 */
public class StringSplit {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");  
        WebDriver driver = new ChromeDriver();  
        driver.get("https://www.baidu.com");  
        driver.manage().window().maximize();  
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); 
        Thread.sleep(1000); 
        driver.findElement(By.id("kw")).sendKeys("喵");  
        driver.findElement(By.id("su")).click();  
        Thread.sleep(3000);  
        // 定位 百度为您找到相关结果约xxxx个 这个元素  
        WebElement result = driver.findElement(By.xpath("//*/div[@class='nums']"));  
        // 获取该字段值  "搜索工具 百度为您找到相关结果约xxxxx个"  
        String result_string = result.getText();
        //System.out.println(result_string);
        // 根据约这个词切片，取第二片字符串，应该得到“xxxx个”  
        String st1 = result_string.split("约")[1];  
        //System.out.println(st1);  
        //再切一次，去除个，得到我们想要的数字结果数  
        String search_number = st1.split("个")[0];  
        System.out.println(search_number);
        Thread.sleep(1000); 
        driver.quit(); 
	}

}
