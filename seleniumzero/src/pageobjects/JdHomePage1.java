/**
 * 
 */
package pageobjects;
/** 
 * @author 
 * @version 创建时间：2017年10月10日 下午2:59:56 
 * 类说明 
 */
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.support.FindBy; 
/**
 * PageFactory是为了支持页面设计模式而开发出来的，它的方法在selenium.support库里面。
PageFactory它提供初始化页面元素的方法，如果页面存在大量的AJAX的技术，只要页面更新一次，它就好重新查找一次元素，所以不会出现StaleElementException这个error,
如果你不想要它每次都更新，你可以加上@CacheLookup.
页面设计模式，可以提供你一个接口，然后你在这个接口上面，构建你自己项目中的页面对象，使用PageFactory使得测试更简单，更少的代码编写。
如果@FindBy没有指定，它会默认的查找id的属性，然后是name属性，如果还没有找到就会报错。 
如果这个元素存在，我们不用担心它， pageFactory会初始化这个元素，不会报任何错误
 *
 */
public class JdHomePage1 
{
	// 元素定位  
    //登录链接  
    @FindBy (id="ttbar-login")  
    WebElement login_link;  
      
    //账户登录  
    @FindBy (xpath="//*/div[@class='login-form']/div[2]/a")  
    WebElement login_withAccount;  
      
    //输入用户名框  
    @FindBy (id="loginname")  
    WebElement inputBox_username;  
      
    //输入密码  
    @FindBy (id="nloginpwd")  
    WebElement inputBox_password;  
      
    //登录按钮  
    @FindBy (id="loginsubmit")  
    WebElement login_submitBtn;  
      
    // 业务逻辑和操作方法  
      
    //登录方法  
    public void login(String username, String password)
    {  
          
        login_link.click();  
        login_withAccount.click();  
        inputBox_username.sendKeys(username);  
        inputBox_password.sendKeys(password);  
        login_submitBtn.click();  
          
    }  
      
}
