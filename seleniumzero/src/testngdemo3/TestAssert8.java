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
 * assertTrue(�������ʽ, ��message1��)
 * ����������ʽΪ�棬�ö�������ͨ��
 * ������ʽΪ�٣��׳��쳣����ӡmessage1����Ϣ��
 *
 */
public class TestAssert8 {

	@Test  
    public void AssertTest(){  
  
        String[] st1 = {"cat", "dog", "rat"};  
        //String[] st2 = {"dog", "rat", "cat"};  
        String[] st3 = st1;  
        Assert.assertTrue(st1==st3, "���߲���ͬ");   
    }  
}
