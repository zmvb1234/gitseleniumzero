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
 * 
 * assertNotSame(actual, expect, “message”)
 * 断言两个对象内存地址不相同的断言方法。
 *
 */
public class TestAssert7 {

	@Test  
    public void AssertTest(){  
  
        String[] st1 = {"cat", "dog", "rat"};  
        String[] st2 = {"dog", "rat", "cat"};  
        //String[] st3 = st1;  
        Assert.assertNotSame(st1, st2, "same");  
    }  
}
