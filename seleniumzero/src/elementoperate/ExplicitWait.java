/**
 * 
 */
package elementoperate;
/** 
 * @author 
 * @version ����ʱ�䣺2017��9��12�� ����4:23:06 
 * ��˵�� 
 */
import java.util.concurrent.TimeUnit;  
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.firefox.FirefoxDriver;  
import org.openqa.selenium.support.ui.ExpectedConditions;  
import org.openqa.selenium.support.ui.WebDriverWait; 
/**
 *implicitlyWait��Ҫ������ֻ����ҳ��Ԫ��չʾ��Ԫ���Ƿ���ʾ�������Ԫ��û����ʾ�ͻᱨ����ʾ��Ԫ�ز��ɼ���
 *��Explicit wait��������һ�����ʱ��ģ�����������ʱ�䣬Ҳ�ᱨ��
 *
 */
public class ExplicitWait {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", ".\\Tools\\geckodriver.exe");    
        WebDriver driver = new FirefoxDriver();        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   
        driver.get("https://www.icloud.com/");    
        // ����һ��WebDriverWait���һ������ wait������5��Ĭ�ϵ�λ����  
        WebDriverWait wait=new WebDriverWait(driver,5);   
        // �ȴ�֪��5��֮���Ԫ�ػ��ǲ��ɼ����ͱ���  
        driver.switchTo().frame("auth-frame");  
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='appleId']")));  
        boolean status = element.isDisplayed(); 
        // �ж�  
        if (status) 
        {  
            System.out.println("===== Ԫ�ؿɼ�======");  
        } 
        else 
        {  
            System.out.println("===== Ԫ�ز��ɼ�======");  
        }  
        driver.quit();
	}

}
