/**
 * 
 */
package testngdemo2;

import org.testng.annotations.Test;

/** 
 * @author 
 * @version ����ʱ�䣺2017��12��7�� ����10:04:42 
 * ��˵�� 
 */
/**
 * ��Testng�У��������ǰ�������@Testע�ͣ�Ȼ��û�����������ԣ���ôĬ����������ᱻ�Զ����С�
 * ����Ҳ���Ҫĳ�����������أ���Щ�˵�һ��Ӧ���ǣ����������ǰ���@Test��ɾ������ע�ͷ���ע�����С�
 * ���ȷ��һ������������@Testע�����ṩ��һ��enabled�����ԣ���������ʱȥ�޸ĸ�����������ִ�С�
 * Enable����������ֵtrue��false��
 *
 */
public class TestEnabled1 {
	@Test  
    public void test1(){  
        System.out.println("test1");  
    }  
  
    @Test(enabled=false)  
    public void test2(){  
        System.out.println("test2");  
    }  
  
    @Test(enabled=true)  
    public void test3(){  
        System.out.println("test3");  
    }  
  
    @Test  
    public void test4(){  
        System.out.println("test4");  
    }  

}
