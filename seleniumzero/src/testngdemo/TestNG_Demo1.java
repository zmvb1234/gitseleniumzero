/**
 * 
 */
package testngdemo;

import org.testng.annotations.Test;

/** 
 * @author 
 * @version 创建时间：2017年12月7日 上午9:13:21 
 * 类说明 
 */
/**
 * 通过注释语句“@Test”添加在方法的前面，这个方法就会被执行。
 *如果添加@Test，说明这个方法是一个测试方法，一般，也叫测试用例。
 *
 */
public class TestNG_Demo1 {
	@Test  
    public void test1(){  
        System.out.println("Hello");  
    }  
    @Test  
    public void test2(){  
        System.out.println("TestNG");  
    }  

}
