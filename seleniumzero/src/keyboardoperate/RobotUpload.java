/**
 * 
 */
package keyboardoperate;
/** 
 * 
 * @version ����ʱ�䣺2017��9��12�� ����3:40:41 
 * ��˵�� 
 */
import java.awt.AWTException;
import java.awt.Robot;  
import java.awt.Toolkit;  
import java.awt.datatransfer.StringSelection;  
import java.awt.event.KeyEvent;  

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver; 
/**
 *Robot�м���������Ϊ��Ϊ���������̣�
 *��һ�������ǰ��¼����ϼ��������ڶ����������ͷŻ����ɿ��������
 *
 */
public class RobotUpload {

	/**
	 * @param args
	 * @throws InterruptedException 
	 * @throws AWTException 
	 */
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");  
	    WebDriver driver = new ChromeDriver();  
	    driver.manage().window().maximize();  
	    driver.get("https://www.baidu.com");    
	    // ָ��ͼƬ��·���������ҷ�������  
	    StringSelection sel = new StringSelection("C:\\Users\\Administrator\\Desktop\\cat.PNG");      
	    // ��ͼƬ�ļ�·�����Ƶ�������  
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);  
	    System.out.println("selection" +sel);      
	    // �������������ť  
	    driver.findElement(By.xpath("//*/span[@class='soutu-btn']")).click();    
	     // ��������ϴ�ͼƬ  
	     driver.findElement(By.xpath("//*/input[@class='upload-pic']")).click();  
	     // �½�һ��Robot��Ķ���  
	     Robot robot = new Robot();  
	     Thread.sleep(1000);  
	     // ���»س�  
	     robot.keyPress(KeyEvent.VK_ENTER);  
	     // �ͷŻس�  
	     robot.keyRelease(KeyEvent.VK_ENTER);  
	     // ���� CTRL+V  
	     robot.keyPress(KeyEvent.VK_CONTROL);  
	     robot.keyPress(KeyEvent.VK_V);  
	     // �ͷ� CTRL+V  
	     robot.keyRelease(KeyEvent.VK_CONTROL);  
	     robot.keyRelease(KeyEvent.VK_V);  
	     Thread.sleep(1000);  
	     // ����س� Enter   
	     robot.keyPress(KeyEvent.VK_ENTER);  
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     Thread.sleep(2000);
	     driver.quit();
	     /**
	      *1. ��selnium���web�ϱ����ϴ��ļ��İ�ť
          *2.�ڵ������ļ�·�������Ĭ���ǹ��۽������ǰ��ļ��ڴ����ϵ�·����ͨ���������������д��ȥ��
          *3.ͨ�����»س�վ��Ĭ�ϴ���������ȷ����ť��������ļ��ϴ����̡�
	      *
	      */
	}

}
