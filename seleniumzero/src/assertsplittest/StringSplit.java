/**
 * 
 */
package assertsplittest;
/** 
 * @author 
 * @version ����ʱ�䣺2017��9��30�� ����9:43:56 
 * ��˵�� 
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
        driver.findElement(By.id("kw")).sendKeys("��");  
        driver.findElement(By.id("su")).click();  
        Thread.sleep(3000);  
        // ��λ �ٶ�Ϊ���ҵ���ؽ��Լxxxx�� ���Ԫ��  
        WebElement result = driver.findElement(By.xpath("//*/div[@class='nums']"));  
        // ��ȡ���ֶ�ֵ  "�������� �ٶ�Ϊ���ҵ���ؽ��Լxxxxx��"  
        String result_string = result.getText();
        //System.out.println(result_string);
        // ����Լ�������Ƭ��ȡ�ڶ�Ƭ�ַ�����Ӧ�õõ���xxxx����  
        String st1 = result_string.split("Լ")[1];  
        //System.out.println(st1);  
        //����һ�Σ�ȥ�������õ�������Ҫ�����ֽ����  
        String search_number = st1.split("��")[0];  
        System.out.println(search_number);
        Thread.sleep(1000); 
        driver.quit(); 
	}

}
