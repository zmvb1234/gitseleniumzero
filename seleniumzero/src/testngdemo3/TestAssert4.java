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
 * assertNotEquals(actual, expect, ��message1��)
 * ������ȡ����Է�����
 * �������ǽ�����������Ĳ���Ⱦ����������ȣ����message1�����ݡ�
 *
 */
public class TestAssert4 {

	@Test  
    public void AssertTest(){  
  
        String[] st1 = {"cat", "dog", "rat"};  
        String[] st2 = {"dog", "rat", "cat"};  
        Assert.assertNotEquals(st1,st2, "������ͬ");  
    }  
}
