/**
 * 
 */
package testngdemo3;

import org.testng.Assert;
import org.testng.annotations.Test;

/** 
 * @author 
 * @version ����ʱ�䣺2017��12��7�� ����10:28:53 
 * ��˵�� 
 */
/**
 * Ӳ���Ժ�����ԡ�
 * TestNG����õ�һ����������Assert.java,�����ж����̬���������������ϰ�߽�Ӳ���ԡ�
 * ��Ӧ�Ļ���һ������Ե��࣬��SoftAssert.java�����������Ҫ����ʵ�����󣬲��ܵ������ʵ��������������ԡ�
 */
public class TestAssert1 {
	
	/**
	 * TestNG���ṩ�˶��33��assertEquals������������Ҫ��ƥ�䲻ͬ���������ͺͼ����������
	 * ������õľ���assertEquals(actual, expected)
	 * ����assertEquals(actual,expected����message1��)
	 * 
	 * 
	 */
	@Test  
    public void AssertTest(){  
     
        //Assert.assertEquals(12,12);  
        Assert.assertEquals("ABc", "ABC", "actual != expected");
       
    }  

}
