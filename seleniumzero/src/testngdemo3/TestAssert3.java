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
 * assertFalse(������������message1��)
 * ����Ϊ�ٵķ���������һ����������������Ǽ٣������ͨ��������������棬�׳������쳣����ӡmessage1�����ݡ�
 *
 */
public class TestAssert3 {

	@Test  
    public void AssertTest(){  
  
        String[] st1 = {"cat", "dog", "rat"};  
        String[] st2 = {"dog", "rat", "cat"};  
        Assert.assertFalse(st1==st2, "�����ַ�����ͬ");  
    }  
}
