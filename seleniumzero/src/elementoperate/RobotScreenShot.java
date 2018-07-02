/**
 * 
 */
package elementoperate;
/** 
 * @author 
 * @version 创建时间：2017年8月31日 下午2:53:35 
 * 类说明 
 */
import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;  
import java.awt.Robot;  
import java.awt.Toolkit;  
import java.awt.image.BufferedImage;  
import java.io.File;  
import java.io.IOException;  
import java.util.concurrent.TimeUnit;  

import javax.imageio.ImageIO;  

import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
/**
 * @author Administrator
 * 原理是从电脑屏幕左上角画一个长方形，一直画到屏幕右下角，然后得到File对象，
 * 在把这个File是用png还是jpg保存，复制到一个具体路径
 */
public class RobotScreenShot {

	/**
	 * @param args
	 * @throws InterruptedException 
	 * @throws AWTException 
	 * @throws HeadlessException 
	 */
	public static void main(String[] args) throws InterruptedException, HeadlessException, AWTException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");    
        WebDriver driver = new ChromeDriver();    
        driver.manage().window().maximize();    
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
        driver.get("https://www.baidu.com");    
        Thread.sleep(1000);  
        // 调用截图方法  
        BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));  
        try{  
              
            ImageIO.write(image, "png", new File(".\\Screenshots\\screen_robot.png"));   
           }
        catch(IOException e)
          {  
              
            System.out.println(e.getMessage());  
          } 
        driver.quit();
	}

}
