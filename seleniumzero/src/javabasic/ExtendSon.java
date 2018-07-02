
package javabasic;
/** 
 * @author 
 * @version 创建时间：2017年8月24日 上午10:22:29 
 * 类说明 
 */
/**
 * Java有三大特性：封装，继承和多态。
 * Java中有了父类和子类的说法，父类就是被继承的类，子类就是将要继承父类的类。
 * 子类继承父类，通过关键字extends来实现。extends后面跟着的就是父类名称。
 * 子类有父类的非pravite属性和方法。
 * 子类可以拥有自己的属性和方法，即子类可以对父类进行扩展
 * 子类可以用自己的方式去实现父类的方法
 */
public class ExtendSon extends ExtendFather 
{

	/**
	 * @param args
	 */
	public int matCal(int a,int b)
	   {
			// TODO Auto-generated method stub
		this.number=a;
		this.price=b;
        return number*price*2;
	       
	   }
	/**
	 * 1）发生在子类，有子类就有继承
	 * 2）父类方法的参数列表必须完全与被子类重写的方法的参数列表相同
	 * 3）父类的返回类型必须与被子类重写的方法返回类型相同
	 * 4）Java中规定，被子类重写的方法不能拥有比父类方法更加严格的访问权限
	 */
	public int matCal2(int a,int b)
	   {
			// TODO Auto-generated method stub
		this.number=a;
		this.price=b;
        return number+price;
	       
	   }
	/**重写与重载根本区别就是：方法重写是在子类和父类之间，而方法重载是在同一个类里面。
	 *方法重写，子类和父类方法必须保持，返回类型，方法名称，参数个数和参数类型完全保持一致。
	 *而方法重载，只有方法名称相同，其他都可以不相同。
	 *final方法不能被子类的方法覆盖
	**/
}
