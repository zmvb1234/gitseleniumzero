/**
 * 
 */
package testngdemo3;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/** 
 * @author 
 * @version ����ʱ�䣺2017��12��7�� ����11:18:25 
 * ��˵�� 
 */
/**
 * Ӳ���Ծ��ǣ�������е�ִ�ж���ʧ�ܣ���ʹ�����������滹�����������У�Ҳ�������ִ����ȥ��
 * ��ʱ�����ǲ�ϣ������������֣�SoftAssert�ͺܺõذ����ǽ����������⡣
 *
 */
public class TestSoftAssert1 {
	/**
	 * SoftAssert���ص�
       1��  ���һ������ʧ�ܣ������ִ����������µ����������߶��ԡ�
       2��  Ҳ����һ�������ж�����ԣ�ʧ��������һ������Ӱ���������Ե�����
       3��  ��Ҫ���ǵ���assertAll()�ڸ����������һ�����Ժ��档
	 *
	 */
	@Test  
    public void testSoftAssert(){  
        System.out.println("Test start");  
        SoftAssert assertion = new SoftAssert();  
        assertion.assertEquals(12, 13,"���߲����");  
        System.out.println("Test complete");  
        System.out.println(3+8); 
        assertion.assertEquals(12, 12,"���߲����");
        System.out.println(8+8); 
        assertion.assertAll();  
    }  
}
