/**
 * 
 */
package testngdemo;
/** 
 * @author 
 * @version 创建时间：2017年12月7日 下午2:37:55 
 * 类说明 
 */
import org.testng.Assert;  
import org.testng.ITestContext;  
import org.testng.ITestListener;  
import org.testng.ITestResult;  
import org.testng.annotations.Test; 
/**
 * TestNG中的Listener就是对一些接口提供的相关方法的监听
 * 我们可以重写这些方法来达到我们想要做的事情。
 *
 */
public class TestNGListener implements ITestListener {
	@Override
	public void onTestStart(ITestResult iTestResult) {  
        System.out.println("用例启动。" + iTestResult.toString());  
    }  
	@Override
    public void onTestSuccess(ITestResult iTestResult) {  
        System.out.println("用例执行成功，" + iTestResult.toString());  
    }  
	@Override
    public void onTestFailure(ITestResult iTestResult) {  
        System.out.println("用例运行失败，启动截图。");  
            // 调用截图方法  
    }  
	@Override
    public void onTestSkipped(ITestResult iTestResult) {  
  
    }  
	@Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {  
  
    }  
  
    @Override  
    public void onStart(ITestContext iTestContext) {  
  
    }  
  
    @Override  
    public void onFinish(ITestContext iTestContext) {  
  
    }  
  
    @Test  
    public void listenerExampletest() {  
  
        Assert.assertTrue(11==10);  
    }  
}
