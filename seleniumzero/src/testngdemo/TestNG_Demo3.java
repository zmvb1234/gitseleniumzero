/**
 * 
 */
package testngdemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/** 
 * @author 
 * @version ����ʱ�䣺2017��12��7�� ����9:13:21 
 * ��˵�� 
 */
/**
 * @Before��@After ע��
 * Before������@BeforeSuite,@BeforeTest, @BeforeGroups,@BeforeClass,@BeforeMethod
 * After������@AfterSuite,@ AfterTest, @AfterGroups,@ AfterClass,@ AfterMethod
 * ����Щע�����ƾʹ�����ף�ÿ��ע�͵ķ�Χ��ͬ����
 * 
 * 
 *
 */
public class TestNG_Demo3 {
	
	@BeforeClass  
	 public void setUp(){  
	        System.out.println("�������Ե�ǰ������׼����һ������������");  
	    }  
	  
	@AfterClass  
	    public void tearDown(){  
	        System.out.println("�������н�����Ĳ��裬һ���ǻָ����������Կ�ʼ֮ǰ��״̬");  
	    } 
	
	@BeforeTest
	public void BeforTest1(){  
        System.out.println("-------���Կ�ʼ------------");  
    }  
	
	@Test  
    public void Test1(){  
        System.out.println("������������");  
    } 
	
	@AfterTest
	public void AfterTest1(){  
        System.out.println("---------���Խ���-------------");  
    }  

}
