/**
 * 
 */
package testngdemo2;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

/** 
 * @author 
 * @version 创建时间：2017年12月7日 下午2:30:26 
 * 类说明 
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
 
         // 等待执行结束，然后去执行失败用例  
         TestNG testNG1 = new TestNG();  
         List<String> suites1 = new ArrayList<String>();  
         Thread.sleep(5000);  
         suites1.add(".\\test-output\\testng-failed.xml");  
         testNG1.setTestSuites(suites1);  
         testNG1.run();  
 
 
       }  
}
