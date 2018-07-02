/**
 * 
 */
package testngtestrefer;
/** 
 * @author 
 * @version ����ʱ�䣺2017��10��10�� ����9:25:40 
 * ��˵�� 
 */
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
import org.testng.annotations.DataProvider;  
import org.testng.annotations.Test;
/**
 * ������������ Data Driver Test
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
    @DataProvider(name="testdata")  //���������Է����ṩ���ݵķ�����Ҫ��÷������뷵����object[][].
    public Object[][] TestDataFeed(){  
        //����һ����ά����  
        Object [][] baidudata=new Object[2][2];  
        // ���������Ԫ��ֵ�����������õ�һ���û���  
        baidudata[0][0]="Selenium1@baidu.com";  
        // ���õ�һ���û�����  
        baidudata[0][1]="Password1";  
        // ���õڶ����û�����  
        baidudata[1][0]="Selenium2@baidu.com";  
        // ���õڶ����û�����  
        baidudata[1][1]="Password2";  
        // �������ݴ����ű�  
        return baidudata;  
      
    }  

}
