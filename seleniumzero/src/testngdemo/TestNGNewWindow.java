/**
 * 
 */
package testngdemo;
/** 
 * @author 
 * @version ����ʱ�䣺2017��12��8�� ����11:11:08 
 * ��˵�� 
 */
import java.util.Set;
import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.Keys;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.firefox.FirefoxDriver;  
import org.openqa.selenium.interactions.Actions;  
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
/**
 * 
 *
 */
public class TestNGNewWindow {
	private static WebDriver driver;  
    
    @BeforeClass  
    public static void before()
    { 
    	System.setProperty("webdriver.gecko.driver", ".\\Tools\\geckodriver.exe");
        driver=new FirefoxDriver();  
        driver.get("https://www.baidu.com");  
        //driver.manage().window().maximize();  
        System.out.println("there are " + driver.getWindowHandles().size() + " window");  
    }  
    @AfterClass  
    public static void after(){  
        driver.quit();  
    }  
      
    @Test  
    public void getWindowMethod1(){  
        Actions action = new Actions(driver);  
        action.sendKeys(Keys.CONTROL + "n").perform();  
        switchToWindow("�±�ǩҳ", driver);  
        driver.get("http://www.sina.com.cn");
        driver.manage().window().maximize();
        System.out.println("there are " + driver.getWindowHandles().size() + " windows");  
    }  
      
    @Test  
    public void getWindowMethod2(){  
        JavascriptExecutor oJavaScriptExecutor = (JavascriptExecutor)driver;  
        oJavaScriptExecutor.executeScript("window.open();");  
        System.out.println("there are " + driver.getWindowHandles().size() + " windows");  
    }  
      
    @Test  
    public void getWindowMethod3(){  
        String href = driver.findElement(By.partialLinkText("����")).getAttribute("href");  
        JavascriptExecutor oJavaScriptExecutor = (JavascriptExecutor)driver;  
        oJavaScriptExecutor.executeScript("window.open('" + href + "')");  
        System.out.println("there are " + driver.getWindowHandles().size() + " windows");  
    }  
      
    public static boolean switchToWindow(String windowTitle,WebDriver dr){    
        boolean flag = false;    
        try {   
            //��ҳ�������е�windowshandle������set���ϵ���  
            String currentHandle = dr.getWindowHandle();    
            Set<String> handles = dr.getWindowHandles();    
            for (String s : handles) {    
                if (s.equals(currentHandle))    
                    continue;    
                else {    
                    dr.switchTo().window(s);  
            //�͵�ǰ�Ĵ��ڽ��бȽ������ͬ���л���windowhandle  
            //�ж�title�Ƿ��handles��ǰ�Ĵ�����ͬ  
                    if (dr.getTitle().contains(windowTitle)) {    
                        flag = true;    
                        System.out.println("Switch to window: "    
                                + windowTitle + " successfully!");    
                        break;    
                    } else    
                        continue;    
                }    
            }    
        } catch (Exception e) {    
            System.out.printf("Window: " + windowTitle    
                    + " cound not found!", e.fillInStackTrace());    
            flag = false;    
        }    
        return flag;    
    }   
}
