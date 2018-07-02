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
 * assertEqualsNoOrder(（actual, expect）
 * 判断两个对象是否相同，忽略排序位置。例如下面的两个字符串数组比较。
 *
 */
public class TestAssert2 {

	@Test  
    public void AssertTest(){  
  
        String[] st1 = {"cat", "dog", "rat"};  
        String[] st2 = {"dog", "rat", "cat"};  
        Assert.assertEqualsNoOrder(st1, st2, "两个字符串数组不相同");  
    }  
}
