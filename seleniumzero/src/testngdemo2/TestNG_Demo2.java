/**
 * 
 */
package testngdemo2;

import org.testng.annotations.Test;

/** 
 * @author 
 * @version 创建时间：2017年12月7日 上午9:13:21 
 * 类说明 
 */
/**
 * TestNG通过设置testng.xml文件能做以下事情
   1）创建来源不同包、类、方法的测试套件
   2）包括一些选项，例如失败的用例可以重跑。
   3）支持使用正则表达式
   4）运行把外部参数传入测试方法
   5）支持配置多线程的执行环境。
 *
 */
public class TestNG_Demo2 {
	@Test  
    public void test1(){  
        System.out.println("Hello");  
    }  
    @Test  
    public void test2(){  
        System.out.println("TestNG");  
    }  

}
