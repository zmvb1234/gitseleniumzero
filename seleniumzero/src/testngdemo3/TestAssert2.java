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
 * assertEqualsNoOrder(��actual, expect��
 * �ж����������Ƿ���ͬ����������λ�á���������������ַ�������Ƚϡ�
 *
 */
public class TestAssert2 {

	@Test  
    public void AssertTest(){  
  
        String[] st1 = {"cat", "dog", "rat"};  
        String[] st2 = {"dog", "rat", "cat"};  
        Assert.assertEqualsNoOrder(st1, st2, "�����ַ������鲻��ͬ");  
    }  
}
