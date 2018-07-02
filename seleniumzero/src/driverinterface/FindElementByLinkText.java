/**
 * 
 */
package driverinterface;
/** 
 * @author 
 * @version ����ʱ�䣺2017��8��24�� ����11:30:41 
 * ��˵�� 
 */
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver; 
/**
 * linktext�أ�������������ҳ�Ͽ�����һ�����ӣ�������һ����������,
 * �����ǵ��������֣��Ϳ�����ת������ҳ�档
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
        //By linkText ����Ԫ��  
        driver.findElement(By.linkText("����")).click();  
        Thread.sleep(1000);  
        //�жϴ�ҳ���ǲ��ǰٶ����ţ�������url��Ϊ��֤  
        assert driver.getCurrentUrl() == "http://news.baidu.com"; 
        Thread.sleep(1000); 
        driver.quit();
	}

}
