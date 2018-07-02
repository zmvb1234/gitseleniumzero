/**
 * 
 */
package testngdemo2;

import org.testng.annotations.Test;

/** 
 * @author 
 * @version 创建时间：2017年12月7日 上午11:27:18 
 * 类说明 
 */
/**
 * Test Methods（测试方法）
 * 凡是方法（或者叫函数）前面添加了@Test注释，就叫测试方法。
 * 我们实际测试中，写的测试用例，其实就是许多个添加@Test的方法。
 * Test Classes(测试类)
 * 一般我们新建一个Java类文件，如果里面方法有@Test，那么就是一个测试类文件。
 * 这个在testng.xml文件里可以体现，classes下可以有一个或者多个测试类文件。
 * Classes相当于就是一个装class的容器，而class又相当于一个装method的容器。
 * Test Groups（测试组）
 * 测试组，一个组可以包含多个methods。
 * 还可以组嵌套，也是就是一个组可以属于是另外一个组管理。
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
