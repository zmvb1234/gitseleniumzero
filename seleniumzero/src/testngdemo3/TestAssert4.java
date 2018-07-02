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
 * assertNotEquals(actual, expect, “message1”)
 * “不相等”断言方法，
 * 这里我们介绍两个对象的不相等举例，如果相等，输出message1的内容。
 *
 */
public class TestAssert4 {

	@Test  
    public void AssertTest(){  
  
        String[] st1 = {"cat", "dog", "rat"};  
        String[] st2 = {"dog", "rat", "cat"};  
        Assert.assertNotEquals(st1,st2, "两个相同");  
    }  
}
