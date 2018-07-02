package driverinterface;
/** 
 * @author 
 * @version 创建时间：2017年10月16日 下午2:11:10 
 * 类说明 
 */
import java.awt.AWTException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import keyboardoperate.RobotKeyAction;

/**
 * @author Administrator
 *
 */
public class WebDriverDemo 
{
	public WebDriver driver;
    public WebDriverDemo() 
    {
        
        //初始化一个火狐浏览器实例，实例名称叫driver  
        //System.setProperty("webdriver.gecko.driver", ".\\Tools\\geckodriver.exe");  
        //driver = new FirefoxDriver(); 
        //初始化一个火狐浏览器实例，实例名称叫driver  
    	System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");    
        //初始化一个chrome浏览器实例，实例名称叫driver    
        driver = new ChromeDriver();
        //最大化窗口    
        driver.manage().window().maximize();
       //设置隐性等待时间    
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);  
        driver.get("http://localhost:8001/demo/demo.html");
    }

    public void testBaidu() 
    {
        driver.navigate().to("http://www.baidu.com");
        driver.quit();
    }

    public void testGoTo(String url) 
    {
        driver.get(url);
        //driver.manage().window().maximize();
    }

    public void testQuit() 
    {
        // driver.close();
        driver.quit();
    }

    public void testInput(String value) 
    {
        WebElement element = driver.findElement(By.id("user"));
        element.sendKeys(value);
        element.clear();
        element.sendKeys(value);
        String text = element.getAttribute("value");
        System.out.println(text);
    }

    public void testLink() 
    {
        WebElement element = driver.findElement(By.className("baidu"));
        String href = element.getAttribute("href");
        System.out.println(href);
        String text = element.getText();
        System.out.println(text);
        element.click();
        driver.navigate().back();
    }

    public void testSelect(String value) 
    {
        WebElement element = driver.findElement(By.name("select"));
        Select select = new Select(element);
        select.selectByValue(value);
        String text = select.getFirstSelectedOption().getText();
        System.out.println(text);
    }

    public void testRadioBox(int index) 
    {
        List<WebElement> elements = driver.findElements(By.name("identity"));
        elements.get(index).click();
        boolean select = elements.get(index).isSelected();
        System.out.println(select);
    }

    @SuppressWarnings("static-access")
	public void testCheckBox(int index) throws AWTException
    {
        List<WebElement> elements = driver.findElements(By
                .xpath("//div[@id='checkbox']/input"));
        WebElement element = elements.get(index);
        element.click();
        boolean check = element.isSelected();
        System.out.println(check);
        RobotKeyAction rka =new RobotKeyAction();
        rka.keyPressWithPagedown();
    }

    public void testButton() 
    {
        WebElement element = driver.findElement(By.className("button"));
        element.click();
        boolean button = element.isEnabled();
        System.out.println(button);
    }

    public void testAlert() throws InterruptedException 
    {
        WebElement element = driver.findElement(By.className("alert"));
        Actions action = new Actions(driver);
        action.click(element).perform();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        System.out.println(text);
        alert.accept();
    }

    public void testUpload(String filePath) 
    {
        WebElement element = driver.findElement(By.id("load"));        
        element.sendKeys(filePath);        
    }
    
    public void testJavaScript() throws InterruptedException
    {
        JavascriptExecutor j = (JavascriptExecutor)driver;
        j.executeScript("alert('hello wrold!')");
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        System.out.println(text);
        alert.accept();
    }

    public void testMultiWindow() throws InterruptedException
    {
        WebElement element = driver.findElement(By.className("open"));
        element.click();
        Thread.sleep(3000);
        Set<String> handles = driver.getWindowHandles();
        String handle = driver.getWindowHandle();
        handles.remove(driver.getWindowHandle());
        WebDriver d = driver.switchTo().window(handles.iterator().next());        
        d.close();    
        driver.switchTo().window(handle);
        Thread.sleep(2000);
    }

    public void testAction() throws InterruptedException 
    {
        WebElement element = driver.findElement(By.id("over"));
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
        String text = driver.findElement(By.id("over")).getText();
        System.out.println(text);
        Thread.sleep(2000);
    }

    public void testWait() 
    {
        WebElement element = driver.findElement(By.cssSelector("#wait > input"));
        element.click();
        driver.manage().timeouts().implicitlyWait(32, TimeUnit.SECONDS);
        System.out.println(driver.findElement(By.cssSelector("#display > div:nth-child(1)")).getText());
    }

    public static void main(String[] args) throws InterruptedException, AWTException 
    {
    	WebDriverDemo d = new WebDriverDemo();
        //d.testGoTo("http://localhost:8001/demo/demo.html");
        d.testInput("hello");
        Thread.sleep(3000);
        d.testLink();
        Thread.sleep(3000);
        d.testRadioBox(2);
        Thread.sleep(3000);
        d.testSelect("opel");
        Thread.sleep(3000);
        d.testCheckBox(2);
        d.testButton();
        d.testUpload("c:\\test.txt");
        Thread.sleep(3000);
        d.testAlert();
        Thread.sleep(3000);
        d.testAction();
        Thread.sleep(3000);
        d.testJavaScript();
        Thread.sleep(3000);
        d.testWait();
        Thread.sleep(5000);
        d.testMultiWindow();
        d.testQuit();
    }
}
