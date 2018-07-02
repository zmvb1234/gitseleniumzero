/**
 * 
 */
package testngdemo3;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/** 
 * @author 
 * @version 创建时间：2017年12月7日 上午11:18:25 
 * 类说明 
 */
/**
 * 硬断言就是，如果运行到执行断言失败，即使该用例，后面还有其他代码行，也不会继续执行下去。
 * 有时候我们不希望这种情况出现，SoftAssert就很好地帮我们解决了这个问题。
 *
 */
public class TestSoftAssert1 {
	/**
	 * SoftAssert的特点
       1）  如果一个断言失败，会继续执行这个断言下的其他语句或者断言。
       2）  也就是一个用例有多个断言，失败了其中一个，不影响其他断言的运行
       3）  不要忘记调用assertAll()在该用例的最后一个断言后面。
	 *
	 */
	@Test  
    public void testSoftAssert(){  
        System.out.println("Test start");  
        SoftAssert assertion = new SoftAssert();  
        assertion.assertEquals(12, 13,"两者不相等");  
        System.out.println("Test complete");  
        System.out.println(3+8); 
        assertion.assertEquals(12, 12,"两者不相等");
        System.out.println(8+8); 
        assertion.assertAll();  
    }  
}
