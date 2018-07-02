/**
 * 
 */
package testngtestrefer;
/** 
 * @author 
 * @version 创建时间：2017年10月10日 上午9:40:55 
 * 类说明 
 */
import java.io.File;  
import java.io.FileInputStream;   
import org.apache.poi.xssf.usermodel.XSSFSheet;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  
import org.openqa.selenium.By;    
import org.openqa.selenium.WebDriver;    
import org.openqa.selenium.chrome.ChromeDriver;    
import org.testng.annotations.DataProvider;    
import org.testng.annotations.Test; 
/**
 * @author Administrator
 *
 */
public class TestNGDDT2 
{
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
        
    @DataProvider(name="testdata")   
    public Object[][] TestDataFeed() throws Exception
    {  
        File src = new File(".\\Files\\test-data.xlsx");    
        FileInputStream fis = new FileInputStream(src);    
        @SuppressWarnings("resource")    
        XSSFWorkbook wb=new XSSFWorkbook(fis);      
        XSSFSheet sh1= wb.getSheetAt(0);    
        int numberrow = sh1.getPhysicalNumberOfRows();  
        Object [][] baidudata=new Object[numberrow][2];  
        for(int i=0;i<numberrow;i++)
        {    
                baidudata[i][0] = sh1.getRow(i).getCell(0).getStringCellValue();  
                baidudata[i][1] = sh1.getRow(i).getCell(1).getStringCellValue();  
        }   
        return baidudata;  
          
    }  
}
