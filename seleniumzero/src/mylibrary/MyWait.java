/**
 * 
 */
package mylibrary;
/** 
 * @author 
 * @version ����ʱ�䣺2017��9��28�� ����3:41:49 
 * ��˵�� 
 */
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;
/**
 * @author Administrator
 *
 */
public class MyWait {

	/**
	 * @param args
	 */
	public static WebElement isElementPresent(WebDriver driver, String xpath, int time)
	{  
        WebElement ele = null;  
          
        for(int i=0;i<time;i++)
        {  
            try{  
                  
                ele = driver.findElement(By.xpath(xpath));  
                break;  
               } 
            catch(Exception e)
            {  
                try
                {  
                    Thread.sleep(1000);  
                } 
                catch(InterruptedException e1)
                {  
                    System.out.println("Waiting for element to appear on DOM");  
                }  
            }  
        }  
        return ele;  
    }  

}
