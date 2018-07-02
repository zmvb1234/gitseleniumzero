/**
 * 
 */
package testngdemo2;

import org.testng.annotations.Test;

/** 
 * @author 
 * @version 创建时间：2017年12月7日 上午10:15:45 
 * 类说明 
 */
/**
 * invocationCount 字面意思就是调用的次数统计,就是这个测试用例被调用执行的次数。
 * 说明这个属性可以设置一个用例可以重复跑几次，这样理解就好。
 * invocationTimeOut 字面意思是调用的超时，设置一个最大的毫秒数来计算执行多次后总共耗时多少，耗时值不能超过设置的最大毫秒数。
 * 这个属性是和invocationCount结合使用才会工作。
 */
public class TestInvocation {
	
	@Test(invocationCount = 5, invocationTimeOut = 5100)  
    public void loginTest() throws InterruptedException{  
  
        Thread.sleep(1000);  
        System.out.println("login test"); 
	}
}
