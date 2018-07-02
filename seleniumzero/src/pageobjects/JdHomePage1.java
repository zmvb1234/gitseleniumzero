/**
 * 
 */
package pageobjects;
/** 
 * @author 
 * @version ����ʱ�䣺2017��10��10�� ����2:59:56 
 * ��˵�� 
 */
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.support.FindBy; 
/**
 * PageFactory��Ϊ��֧��ҳ�����ģʽ�����������ģ����ķ�����selenium.support�����档
PageFactory���ṩ��ʼ��ҳ��Ԫ�صķ��������ҳ����ڴ�����AJAX�ļ�����ֻҪҳ�����һ�Σ����ͺ����²���һ��Ԫ�أ����Բ������StaleElementException���error,
����㲻��Ҫ��ÿ�ζ����£�����Լ���@CacheLookup.
ҳ�����ģʽ�������ṩ��һ���ӿڣ�Ȼ����������ӿ����棬�������Լ���Ŀ�е�ҳ�����ʹ��PageFactoryʹ�ò��Ը��򵥣����ٵĴ����д��
���@FindByû��ָ��������Ĭ�ϵĲ���id�����ԣ�Ȼ����name���ԣ������û���ҵ��ͻᱨ�� 
������Ԫ�ش��ڣ����ǲ��õ������� pageFactory���ʼ�����Ԫ�أ����ᱨ�κδ���
 *
 */
public class JdHomePage1 
{
	// Ԫ�ض�λ  
    //��¼����  
    @FindBy (id="ttbar-login")  
    WebElement login_link;  
      
    //�˻���¼  
    @FindBy (xpath="//*/div[@class='login-form']/div[2]/a")  
    WebElement login_withAccount;  
      
    //�����û�����  
    @FindBy (id="loginname")  
    WebElement inputBox_username;  
      
    //��������  
    @FindBy (id="nloginpwd")  
    WebElement inputBox_password;  
      
    //��¼��ť  
    @FindBy (id="loginsubmit")  
    WebElement login_submitBtn;  
      
    // ҵ���߼��Ͳ�������  
      
    //��¼����  
    public void login(String username, String password)
    {  
          
        login_link.click();  
        login_withAccount.click();  
        inputBox_username.sendKeys(username);  
        inputBox_password.sendKeys(password);  
        login_submitBtn.click();  
          
    }  
      
}
