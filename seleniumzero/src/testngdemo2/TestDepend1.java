/**
 * 
 */
package testngdemo2;

import org.testng.annotations.Test;

/** 
 * @author 
 * @version ����ʱ�䣺2017��12��7�� ����10:22:40 
 * ��˵�� 
 */
/**
 * dependsOnMethods ���Ҫ���е�ǰ�Ĳ�����������Ҫ������ָ�������������������е�ǰ������
 * ע��Ⱥź����Ǵ�����{}
 */
public class TestDepend1 {
	   
	    @Test(dependsOnMethods={"test5"})  
	    public void test1(){  
	        System.out.println("test1");  
	    }  
	  
	    @Test  
	    public void test2(){  
	        System.out.println("test2");  
	    }  
	  
	    @Test  
	    public void test3(){  
	        System.out.println("test3");  
	    }  
	  
	    @Test  
	    public void test4(){  
	        System.out.println("test4");  
	    }  
	  
	    @Test  
	    public void test5(){  
	        System.out.println("test5");  
	    }  
}
