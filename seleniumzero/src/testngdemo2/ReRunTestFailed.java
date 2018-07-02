/**
 * 
 */
package testngdemo2;

import org.testng.Assert;
import org.testng.annotations.Test;

/** 
 * @author 
 * @version 创建时间：2017年12月7日 下午2:23:57 
 * 类说明 
 */
/**
 * @author Administrator
 *
 */
public class ReRunTestFailed {
	 @Test  
	    public void test01(){  
	        System.out.println("test01");  
	    }  
	  
	    @Test(dependsOnMethods = "test03", alwaysRun = true)  
	    public void test02(){  
	        System.out.println("test02");  
	    }  
	  
	    @Test  
	    public void test03(){  
	        Assert.assertTrue(10==11);  
	        System.out.println("test03");  
	    }  
	  
	    @Test(dependsOnMethods = "test05", alwaysRun = true)  
	    public void test04(){  
	        System.out.println("test04");  
	    }  
	  
	    @Test  
	    public void test05(){  
	        Assert.assertTrue(12==13);  
	        System.out.println("test05");  
	    }  
}
