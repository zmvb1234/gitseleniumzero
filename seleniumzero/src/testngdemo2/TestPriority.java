/**
 * 
 */
package testngdemo2;

import org.testng.annotations.Test;

/** 
 * @author 
 * @version ����ʱ�䣺2017��12��7�� ����10:09:50 
 * ��˵�� 
 */
/**
 * һ�����ļ��µĲ��������������������˳��ȥִ�У�������Ĭ�ϰ��շ���������ĸ����ȥִ�С�
 * @Testע������һ�����ԣ���priority֧���������������ȼ���
 * �������������ԣ�Ĭ��priority�ǵ���0������priorityֵԽС�����ȼ�Խ�ߡ�
 *
 */
public class TestPriority {
	@Test(priority = 3)  
    public void test1(){  
        System.out.println("test1");  
    }  
  
    @Test(priority = 2)  
    public void test2(){  
        System.out.println("test2");  
    }  
  
    @Test(priority = 1)  
    public void test3(){  
        System.out.println("test3");  
    }  
  
    @Test  
    public void test4(){  
        System.out.println("test4");  
    }  
}
