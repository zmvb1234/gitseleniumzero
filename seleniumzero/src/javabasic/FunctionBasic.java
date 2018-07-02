/**
 * 
 */
package javabasic;
/** 
 * @author 
 * @version 创建时间：2017年8月23日 下午8:03:54 
 * 类说明 
 */
/**
 * @author Administrator
 *
 */
public class FunctionBasic 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// 调用方法
		FunctionBasic fb =new FunctionBasic();
		//调用第一个方法
		fb.myFirstMethod();
		//调用第二个方法
		fb.myFirstMethod("Everyone");
	}
	//重载的基本特点就是，方法名称相同，但是方法参数类型不同.参数类型不同，包括，参数个数和参数变量类型不同。
	// 定义自己的第一个方法  
    public void myFirstMethod()
    {  
        System.out.println("Hello Java!");  
    }  
 // 定义自己的第二个方法  
    public void myFirstMethod(String name)
    {  
        System.out.println("Hello!"+""+name+"!");  
    }  
}
