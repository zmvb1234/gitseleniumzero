/**
 * 
 */
package testngdemo3;

import org.testng.Assert;
import org.testng.annotations.Test;

/** 
 * @author 
 * @version 创建时间：2017年12月7日 上午10:28:53 
 * 类说明 
 */
/**
 * 硬断言和软断言。
 * TestNG中最常用的一个断言类是Assert.java,里面有多个静态方法，这个类我们习惯叫硬断言。
 * 对应的还有一个软断言的类，叫SoftAssert.java，这个类是需要创建实例对象，才能调用相关实例方法进行软断言。
 */
public class TestAssert1 {
	
	/**
	 * TestNG中提供了多个33个assertEquals（）方法，主要是匹配不同的数据类型和集合类操作。
	 * 我们最常用的就是assertEquals(actual, expected)
	 * 或者assertEquals(actual,expected，“message1”)
	 * 
	 * 
	 */
	@Test  
    public void AssertTest(){  
     
        //Assert.assertEquals(12,12);  
        Assert.assertEquals("ABc", "ABC", "actual != expected");
       
    }  

}
