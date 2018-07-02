/**
 * 
 */
package testngdemo;
/** 
 * @author 
 * @version ����ʱ�䣺2017��12��7�� ����2:37:55 
 * ��˵�� 
 */
import org.testng.Assert;  
import org.testng.ITestContext;  
import org.testng.ITestListener;  
import org.testng.ITestResult;  
import org.testng.annotations.Test; 
/**
 * TestNG�е�Listener���Ƕ�һЩ�ӿ��ṩ����ط����ļ���
 * ���ǿ�����д��Щ�������ﵽ������Ҫ�������顣
 *
 */
public class TestNGListener implements ITestListener {
	@Override
	public void onTestStart(ITestResult iTestResult) {  
        System.out.println("����������" + iTestResult.toString());  
    }  
	@Override
    public void onTestSuccess(ITestResult iTestResult) {  
        System.out.println("����ִ�гɹ���" + iTestResult.toString());  
    }  
	@Override
    public void onTestFailure(ITestResult iTestResult) {  
        System.out.println("��������ʧ�ܣ�������ͼ��");  
            // ���ý�ͼ����  
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
