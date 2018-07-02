/**
 * 
 */
package testngdemo2;

import org.testng.annotations.Test;

/** 
 * @author 
 * @version 创建时间：2017年12月7日 上午10:04:42 
 * 类说明 
 */
/**
 * 在Testng中，如果方法前面添加了@Test注释，然后没有其他的属性，那么默认这个用例会被自动运行。
 * 如果我不想要某个方法运行呢？有些人第一反应就是，把这个方法前面的@Test给删除或者注释符号注销该行。
 * 这的确是一个方法，但在@Test注释中提供了一个enabled的属性，让我们临时去修改该条用例不被执行。
 * Enable属性有两个值true和false。
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
