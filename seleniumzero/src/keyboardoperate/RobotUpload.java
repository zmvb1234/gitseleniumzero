/**
 * 
 */
package keyboardoperate;
/** 
 * 
 * @version 创建时间：2017年9月12日 下午3:40:41 
 * 类说明 
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
 *Robot中键盘输入行为分为了两个过程：
 *第一个过程是按下键盘上键不动，第二个过程是释放或者松开这个键。
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
	    // 指定图片的路径，这里我放桌面上  
	    StringSelection sel = new StringSelection("C:\\Users\\Administrator\\Desktop\\cat.PNG");      
	    // 把图片文件路径复制到剪贴板  
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);  
	    System.out.println("selection" +sel);      
	    // 点击照相机这个按钮  
	    driver.findElement(By.xpath("//*/span[@class='soutu-btn']")).click();    
	     // 点击本地上传图片  
	     driver.findElement(By.xpath("//*/input[@class='upload-pic']")).click();  
	     // 新建一个Robot类的对象  
	     Robot robot = new Robot();  
	     Thread.sleep(1000);  
	     // 按下回车  
	     robot.keyPress(KeyEvent.VK_ENTER);  
	     // 释放回车  
	     robot.keyRelease(KeyEvent.VK_ENTER);  
	     // 按下 CTRL+V  
	     robot.keyPress(KeyEvent.VK_CONTROL);  
	     robot.keyPress(KeyEvent.VK_V);  
	     // 释放 CTRL+V  
	     robot.keyRelease(KeyEvent.VK_CONTROL);  
	     robot.keyRelease(KeyEvent.VK_V);  
	     Thread.sleep(1000);  
	     // 点击回车 Enter   
	     robot.keyPress(KeyEvent.VK_ENTER);  
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     Thread.sleep(2000);
	     driver.quit();
	     /**
	      *1. 用selnium点击web上本地上传文件的按钮
          *2.在弹窗，文件路径输入框默认是光标聚焦，我们把文件在磁盘上的路径，通过拷贝和黏贴方法写上去。
          *3.通过按下回车站，默认触发弹窗的确定按钮，完成了文件上传过程。
	      *
	      */
	}

}
