/**
 * 
 */
package javabasic;
//import javabasic.functionBasic1;
/** 
 * @author 
 * @version 创建时间：2017年8月23日 下午8:30:13 
 * 类说明 
 */
/**
 * @author Administrator
 *
 */
public class FunctionBasic2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
    {
	//初始化一个对象或者实例	
	FunctionBasic1 fb1=new FunctionBasic1();
	fb1.setAge(18);
	fb1.setId(1);
	fb1.setName("小明");
	System.out.println(fb1.getName() + " 今年 " + fb1.getAge() + "岁.");
	FunctionBasic1 fb11=new FunctionBasic1(2);
	fb11.setAge(18);
	fb11.setId(1);
	fb11.setName("小明");
	System.out.println(fb11.getName() + " 今年 " + fb11.getAge() + "岁.");
	FunctionBasic1.DoSomethingWithStatic();
	//不推荐这么做
	//fb11.DoSomethingWithStatic();
	//实例调用非静态方法
	fb11.DoSomethingWithNoStatic();
    }
	
}
