/**
 * 
 */
package elementoperate;
/** 
 * @author 
 * @version ����ʱ�䣺2017��9��12�� ����5:28:08 
 * ��˵�� 
 */
import java.util.concurrent.TimeUnit;  

import org.openqa.selenium.By;  
import org.openqa.selenium.NoSuchElementException;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.chrome.ChromeDriver;  
import org.openqa.selenium.support.ui.FluentWait;  
import org.openqa.selenium.support.ui.Wait;  
  

import com.google.common.base.Function; 
/**
 * FluentWait����һ����ͨ���࣬����ʹ���������֧��һֱ�ȴ�ֱ���ض����������֡�
1����һ��������ǰ�org.openqa.selenium.support.ui��һ����
2����Wait�ӿڵ�һ��ʵ��
3��ÿ��Fluent wait�����ǿ������õȴ����ʱ�䣬���ҿ��������õȴ���Ƶ��ȥ���һЩ�ض���������
FluentWait �� Explicit Wait�����𣺼���˵����Explicit Wait����һЩ�趨���˵�ǰ�������ĵȴ���ʽ��
��Fluent wait����������Լ��ķ���ȥ������ֵȴ������⡣
 *
 */
public class FluentWaitOperate {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");  
	     WebDriver driver = new ChromeDriver();  
	     driver.get("http://www.baidu.com/");  
	     driver.manage().window().maximize();  
	        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver) 
	                   .withTimeout(60, TimeUnit.SECONDS)  
	                   .pollingEvery(2, TimeUnit.SECONDS)  
	                   .ignoring(NoSuchElementException.class);  
	        @SuppressWarnings("unused")
			WebElement ele1 = wait.until(new Function<WebDriver, WebElement>() 
	        	{  
	             public WebElement apply(WebDriver driver) 
	             {  
	               return driver.findElement(By.id("1234"));  
	             }  
	           
	           });     

	}

}
