/**
 * 
 */
package testngdemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/** 
 * @author 
 * @version 创建时间：2017年12月7日 上午9:13:21 
 * 类说明 
 */
/**
 * @Before和@After 注释
 * Before分类有@BeforeSuite,@BeforeTest, @BeforeGroups,@BeforeClass,@BeforeMethod
 * After分类有@AfterSuite,@ AfterTest, @AfterGroups,@ AfterClass,@ AfterMethod
 * 看这些注释名称就大概明白，每个注释的范围不同而已
 * 
 * 
 *
 */
public class TestNG_Demo3 {
	
	@BeforeClass  
	 public void setUp(){  
	        System.out.println("启动测试的前提条件准备，一般放这个方法中");  
	    }  
	  
	@AfterClass  
	    public void tearDown(){  
	        System.out.println("测试运行结束后的步骤，一般是恢复环境到测试开始之前的状态");  
	    } 
	
	@BeforeTest
	public void BeforTest1(){  
        System.out.println("-------测试开始------------");  
    }  
	
	@Test  
    public void Test1(){  
        System.out.println("喵喵喵？汪！");  
    } 
	
	@AfterTest
	public void AfterTest1(){  
        System.out.println("---------测试结束-------------");  
    }  

}
