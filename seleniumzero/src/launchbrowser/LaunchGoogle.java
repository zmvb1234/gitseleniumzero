/**
 * 
 */
package launchbrowser;
import java.util.concurrent.TimeUnit;    

import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver; 
/** 
 * @author 
 * @version ����ʱ�䣺2017��8��23�� ����5:49:48 
 * ��˵�� 
 */
/**
 * @author Administrator
 *
 */
public class LaunchGoogle 
         {
	    public static void main(String[] args) 
	    {    
	    System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");    
        //��ʼ��һ��chrome�����ʵ����ʵ�����ƽ�driver    
        WebDriver driver = new ChromeDriver();
        //��󻯴���    
        driver.manage().window().maximize();
       //�������Եȴ�ʱ��    
       driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);    
       // get()��һ��վ��    
       driver.get("https://www.baidu.com");    
      //getTitle()��ȡ��ǰҳ��title��ֵ    
       System.out.println("��ǰ��ҳ��ı����ǣ� "+ driver.getTitle());
       try
       {  
           String baidu_title = "�ٶ�һ�£����֪��"; 
         //Java����һ��������assert,������˼�ж��ԣ�assert������ŵ���һ�����ʽ�����ʽ��ֵ�ǲ�����.
           assert baidu_title == driver.getTitle();  
           System.out.println("Test Pass!"); 
           Thread.sleep(3000);
         }
       catch(Exception e)
       {  
           e.printStackTrace();  
       }  
       //�رղ��˳������    
     driver.quit();   
	
	}
}
