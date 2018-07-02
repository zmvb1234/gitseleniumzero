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
 * assertFalse(布尔条件，“message1”)
 * 断言为假的方法，断言一个条件，如果返回是假，则测试通过，如果返回是真，抛出断言异常，打印message1的内容。
 *
 */
public class TestAssert3 {

	@Test  
    public void AssertTest(){  
  
        String[] st1 = {"cat", "dog", "rat"};  
        String[] st2 = {"dog", "rat", "cat"};  
        Assert.assertFalse(st1==st2, "两个字符串相同");  
    }  
}
