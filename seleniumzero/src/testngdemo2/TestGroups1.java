/**
 * 
 */
package testngdemo2;

import org.testng.annotations.Test;

/** 
 * @author 
 * @version ����ʱ�䣺2017��12��7�� ����11:27:18 
 * ��˵�� 
 */
/**
 * Test Methods�����Է�����
 * ���Ƿ��������߽к�����ǰ�������@Testע�ͣ��ͽв��Է�����
 * ����ʵ�ʲ����У�д�Ĳ�����������ʵ�����������@Test�ķ�����
 * Test Classes(������)
 * һ�������½�һ��Java���ļ���������淽����@Test����ô����һ���������ļ���
 * �����testng.xml�ļ���������֣�classes�¿�����һ�����߶���������ļ���
 * Classes�൱�ھ���һ��װclass����������class���൱��һ��װmethod��������
 * Test Groups�������飩
 * �����飬һ������԰������methods��
 * ��������Ƕ�ף�Ҳ�Ǿ���һ�����������������һ�������
 * 
 *
 */
public class TestGroups1 {
	@Test(groups = {"API", "Fuc"})  
    public void test01(){  
        System.out.println("API Testing and Function testing");  
    }  
  
    @Test(groups = {"API"})  
    public void test02(){  
        System.out.println("API Testing");  
    }  
  
    @Test(groups = {"Func"})  
    public void test03(){  
        System.out.println("Function testing");  
    }  
  
    @Test  
    public void test04(){  
        System.out.println("not in API and Function testing");  
    }  
}
