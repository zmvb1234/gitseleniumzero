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
 * assertNotNull(object, ��message1��)
 * ����ǿ��жϣ����Զ���Ϊ�գ������׳��쳣����ӡmessage1�����ݡ�
 *
 */
public class TestAssert5 {

	@Test  
    public void AssertTest(){  
  
        //String[] st1 = {"cat", "dog", "rat"};  
        //String[] st2 = {"dog", "rat", "cat"};  
        String[] st3 = null;  
        //Assert.assertNotNull(st1,"�ö���Ϊ��");  
        Assert.assertNotNull(st3,"Test Object Is Null!");   
    }  
}
