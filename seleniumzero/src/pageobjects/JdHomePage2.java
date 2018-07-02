/**
 * 
 */
package pageobjects;
/** 
 * @author 
 * @version ����ʱ�䣺2017��10��11�� ����10:13:31 
 * ��˵�� 
 */
import java.util.concurrent.TimeUnit;  
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
/**
 * @author Administrator
 *
 */
public class JdHomePage2 
{
	WebDriver driver;  
    // Ԫ�ض�λ  
    //��¼����  
    By login_link = By.id("ttbar-login");  
    //�˻���¼  
    By login_withAccount = By.xpath("//*/div[@class='login-form']/div[2]/a");  
    //�����û�����  
    By inputBox_username = By.id("loginname");  
    //��������  
    By inputBox_password = By.id("nloginpwd");  
    //��¼��ť  
    By login_submitBtn = By.id("loginsubmit");  
    // ҵ���߼��Ͳ�������  
    // ���췽��  
    public JdHomePage2(WebDriver driver)
    {  
        this.driver = driver;  
    }  
    //�����¼����  
    public void clickLoginLink()
    {  
        driver.findElement(login_link).click();  
        // ����˻���¼��������Ļ�Ĭ���Ƕ�ά��ɨ���¼  
        driver.findElement(login_withAccount).click();  
    }  
    // ��¼������-�����û���  
    public void inputUsername(String username)
    {  
        driver.findElement(inputBox_username).sendKeys(username);  
          
    }  
    // ��¼������-��������  
    public void inputPassword(String password)
    {  
        driver.findElement(inputBox_password).sendKeys(password);  
          
    }  
    // �����¼��ť  
    public void clickLoginBtn()
    {  
        driver.findElement(login_submitBtn).click();  
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);  
    }  
    //�ع�һ����¼����  
    public void login(String name, String pass)
    {  
        driver.findElement(login_link).click();  
        // ����˻���¼��������Ļ�Ĭ���Ƕ�ά��ɨ���¼  
        driver.findElement(login_withAccount).click();  
        driver.findElement(inputBox_username).sendKeys(name);  
        driver.findElement(inputBox_password).sendKeys(pass);  
        driver.findElement(login_submitBtn).click();  
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);  
          
    }  
}
