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
 * assertSame(actual, expect, ��message��)
 * ��������������ͬ��
 * ������ͬ�������Equals��ͬ��Equals��ֵ�Ƚϣ���Same���ڴ��ַ�Ƚϡ�
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
