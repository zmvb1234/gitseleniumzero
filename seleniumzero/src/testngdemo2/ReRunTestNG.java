/**
 * 
 */
package testngdemo2;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

/** 
 * @author 
 * @version ����ʱ�䣺2017��12��7�� ����2:30:26 
 * ��˵�� 
 */
/**
 * @author Administrator
 *
 */
public class ReRunTestNG {
	 public static void main(String[] args) throws InterruptedException {  
		  
         TestNG testNG = new TestNG();  
         ArrayList<String> suites = new ArrayList<String>();  
         suites.add(".\\testngrerun.xml");  
         //suites.add(".\\test-output\\testng-failed.xml");  
         testNG.setTestSuites(suites);  
         testNG.run();  
 
         // �ȴ�ִ�н�����Ȼ��ȥִ��ʧ������  
         TestNG testNG1 = new TestNG();  
         List<String> suites1 = new ArrayList<String>();  
         Thread.sleep(5000);  
         suites1.add(".\\test-output\\testng-failed.xml");  
         testNG1.setTestSuites(suites1);  
         testNG1.run();  
 
 
       }  
}
