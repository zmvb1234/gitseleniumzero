/**
 * 
 */
package driverfunction;
/** 
 * @author
 * @version ����ʱ�䣺2017��8��24�� ����3:27:10 
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
public class GetWindowHandles {

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
        //�̵߳ȴ�
        Thread.sleep(1000);  
        WebElement setHome_link = driver.findElement(By.partialLinkText("��Ϊ��ҳ"));  
        setHome_link.click();  
        Thread.sleep(1000);  
        System.out.println(driver.getWindowHandles());
        Thread.sleep(1000);
        driver.close();
        Thread.sleep(3000);
        driver.quit();
        /**
    	 * close�����ǣ��رյ�ǰ����.
    	 * �����ǰ����ֻ��һ��tab����ô���close�������൱�ڹر����������
    	 * quit��������ֱ���˳����ر����й�����tab���ڡ�
    	 * 
    	 */
	}

}
