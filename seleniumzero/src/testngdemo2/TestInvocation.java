/**
 * 
 */
package testngdemo2;

import org.testng.annotations.Test;

/** 
 * @author 
 * @version ����ʱ�䣺2017��12��7�� ����10:15:45 
 * ��˵�� 
 */
/**
 * invocationCount ������˼���ǵ��õĴ���ͳ��,���������������������ִ�еĴ�����
 * ˵��������Կ�������һ�����������ظ��ܼ��Σ��������ͺá�
 * invocationTimeOut ������˼�ǵ��õĳ�ʱ������һ�����ĺ�����������ִ�ж�κ��ܹ���ʱ���٣���ʱֵ���ܳ������õ�����������
 * ��������Ǻ�invocationCount���ʹ�òŻṤ����
 */
public class TestInvocation {
	
	@Test(invocationCount = 5, invocationTimeOut = 5100)  
    public void loginTest() throws InterruptedException{  
  
        Thread.sleep(1000);  
        System.out.println("login test"); 
	}
}
