/**
 * 
 */
package testngdemo2;

import org.testng.annotations.Test;

/** 
 * @author 
 * @version 创建时间：2017年12月7日 上午10:09:50 
 * 类说明 
 */
/**
 * 一个类文件下的测试用例按照我们设想的顺序去执行，而不是默认按照方法名的字母排序去执行。
 * @Test注释中有一个属性，叫priority支持设置用例的优先级。
 * 如果不带这个属性，默认priority是等于0，而且priority值越小，优先级越高。
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
