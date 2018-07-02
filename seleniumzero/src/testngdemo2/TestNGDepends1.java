/**
 * 
 */
package testngdemo2;

import org.testng.Assert;
import org.testng.annotations.Test;

/** 
 * @author 
 * @version ����ʱ�䣺2017��12��7�� ����1:57:02 
 * ��˵�� 
 */
/**
 * ���������ǲ��������ķ����Ƿ�ɹ�ִ�У��������ķ������������С�
 * ��������ʵ������@Test���������alwaysRun=true��ʵ�֡�
 *
 */
public class TestNGDepends1 {
	@Test(groups = {"tomcat"})  
    public void restartTomcatService(){  
        System.out.println("Restart the tomcat server when it is down!");  
    }  
  
    @Test(groups = {"tomcat"})  
    public void tomcatServiceIsDown(){  
        System.out.println("tomcat service is down!");  
        Assert.assertTrue(10==11);  
    }  
  
    @Test(dependsOnGroups = {"tomcat"}, alwaysRun = true)  
    public void startAppServer(){  
        System.out.println("Start App service");  
    }  
}
