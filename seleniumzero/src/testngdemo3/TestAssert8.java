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
 * assertTrue(条件表达式, “message1”)
 * 如果条件表达式为真，该断言运行通过
 * 如果表达式为假，抛出异常，打印message1的消息。
 *
 */
public class TestAssert8 {

	@Test  
    public void AssertTest(){  
  
        String[] st1 = {"cat", "dog", "rat"};  
        //String[] st2 = {"dog", "rat", "cat"};  
        String[] st3 = st1;  
        Assert.assertTrue(st1==st3, "两者不相同");   
    }  
}
