/**
 * 
 */
package testngdemo2;

import org.testng.annotations.Test;

/** 
 * @author 
 * @version 创建时间：2017年12月7日 上午10:22:40 
 * 类说明 
 */
/**
 * dependsOnMethods 如果要运行当前的测试用例，需要先运行指定的依赖方法后，再运行当前用例。
 * 注意等号后面是大括号{}
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
