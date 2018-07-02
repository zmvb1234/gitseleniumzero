/**
 * 
 */
package elementoperate;
/** 
 * @author 
 * @version ����ʱ�䣺2017��8��31�� ����2:53:35 
 * ��˵�� 
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
 * ԭ���Ǵӵ�����Ļ���Ͻǻ�һ�������Σ�һֱ������Ļ���½ǣ�Ȼ��õ�File����
 * �ڰ����File����png����jpg���棬���Ƶ�һ������·��
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
        // ���ý�ͼ����  
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
