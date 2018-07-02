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
 * assertNotNull(object, “message1”)
 * 对象非空判断，断言对象不为空，否则，抛出异常，打印message1的内容。
 *
 */
public class TestAssert5 {

	@Test  
    public void AssertTest(){  
  
        //String[] st1 = {"cat", "dog", "rat"};  
        //String[] st2 = {"dog", "rat", "cat"};  
        String[] st3 = null;  
        //Assert.assertNotNull(st1,"该对象为空");  
        Assert.assertNotNull(st3,"Test Object Is Null!");   
    }  
}
