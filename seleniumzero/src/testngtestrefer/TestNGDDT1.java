/**
 * 
 */
package testngtestrefer;
/** 
 * @author 
 * @version 创建时间：2017年10月10日 上午9:25:40 
 * 类说明 
 */
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
import org.testng.annotations.DataProvider;  
import org.testng.annotations.Test;
/**
 * 数据驱动测试 Data Driver Test
 *
 */
public class TestNGDDT1 {

	/**
	 * @param args
	 */
	@Test(dataProvider="testdata")  
    public void TestLogin(String username, String password) throws InterruptedException
	{  
  
        System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");  
        WebDriver driver = new ChromeDriver();  
        driver.manage().window().maximize();  
        driver.get("https://www.baidu.com");  
        // click login link  
        driver.findElement(By.xpath("//*[@id='u1']/a[7]")).click();  
        Thread.sleep(2000);   
        driver.findElement(By.xpath("//*[@id='TANGRAM__PSP_10__userName']")).clear();  
        driver.findElement(By.xpath("//*[@id='TANGRAM__PSP_10__userName']")).sendKeys(username);  
        driver.findElement(By.xpath("//*[@id='TANGRAM__PSP_10__password']")).clear();  
        driver.findElement(By.xpath("//*[@id='TANGRAM__PSP_10__password']")).sendKeys(password);
        Thread.sleep(2000);
        driver.quit();
    }  
    @DataProvider(name="testdata")  //给其他测试方法提供数据的方法。要求该方法必须返回是object[][].
    public Object[][] TestDataFeed(){  
        //创建一个二维数组  
        Object [][] baidudata=new Object[2][2];  
        // 设置数组的元素值，这里是设置第一个用户名  
        baidudata[0][0]="Selenium1@baidu.com";  
        // 设置第一个用户密码  
        baidudata[0][1]="Password1";  
        // 设置第二个用户名称  
        baidudata[1][0]="Selenium2@baidu.com";  
        // 设置第二个用户密码  
        baidudata[1][1]="Password2";  
        // 返回数据传给脚本  
        return baidudata;  
      
    }  

}
