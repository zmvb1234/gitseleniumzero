/**
 * 
 */
package testngdemo3;

import org.testng.Assert;
import org.testng.annotations.Test;

/** 
 * @author 
 * @version ����ʱ�䣺2017��12��7�� ����10:44:48 
 * ��˵�� 
 */
/**
 * 
 * assertNotSame(actual, expect, ��message��)
 * �������������ڴ��ַ����ͬ�Ķ��Է�����
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
