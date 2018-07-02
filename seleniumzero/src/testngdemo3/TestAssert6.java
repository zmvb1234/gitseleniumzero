/**
 * 
 */
package testngdemo3;

import org.testng.Assert;
import org.testng.annotations.Test;

/** 
 * @author 
 * @version 创建时间：2017年12月7日 上午10:44:48 
 * 类说明 
 */
/**
 * assertSame(actual, expect, “message”)
 * 断言两个对象相同，
 * 这里相同和上面的Equals不同，Equals是值比较，而Same是内存地址比较。
 *
 */
public class TestAssert6 {

	@Test  
    public void AssertTest(){  
  
        String[] st1 = {"cat", "dog", "rat"};  
        String[] st2 = {"dog", "rat", "cat"};  
        String[] st3 = st1;  
        Assert.assertSame(st1, st3, "not same");  
        Assert.assertSame(st1, st2, "not same");   
    }  
}
