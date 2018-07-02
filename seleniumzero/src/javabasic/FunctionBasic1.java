/**
 * 
 */
package javabasic;
/** 
 * @author 
 * @version 创建时间：2017年8月23日 下午8:23:56 
 * 类说明 
 */
/**
 * @author Administrator
 *
 */
public class FunctionBasic1 {

	/**
	 * 封装把对象的所有组成部分组合在一起，封装定义程序如何引用对象的数据，
	 * 封装实际上使用方法将类的数据隐藏起来，控制用户对类的修改和访问数据的程度。
	 */
	   //封装
	   private int id;  
	   private String name;  
	   private int age;  
	   /**这是构造函数。
	    1）构造函数名称一定要和类名称保持一致。
	    2）构造函数会在对象创建过程是调用
	    3）构造函数可以有多个，用参数个数和参数类型区分
	    4）构造函数内部没有返回语句
	     * 
	     */
	    FunctionBasic1()
	    {
	    System.out.println("这是构造函数！");	
	    }
	    FunctionBasic1(int a)
	    {
	    System.out.println("这是构造函数！"+a);	
	    }
		/**
		 * @return the id
		 */
		public int getId() 
		{
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(int id)
		{
			this.id = id;
		}
		/**
		 * @return the name
		 */
		public String getName() 
		{
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) 
		{
			this.name = name;
		}
		/**
		 * @return the age
		 */
		public int getAge() 
		{
			return age;
		}
		/**
		 * @param age the age to set
		 */
		public void setAge(int age) 
		{
			this.age = age;
		}
		//用static关键字的方法，就叫静态方法，静态方法只能被类本身调用，不能被类的实例对象调用（会出现警告，类型不匹配）.
		//而没有static关键字的方法，在类中叫实例方法
	    public static void DoSomethingWithStatic()
	    {  
	        System.out.println("调用了static方法");  
	    }  
	      
	    public void DoSomethingWithNoStatic()
	    {  
	        System.out.println("调用了非static方法");  
	    } 

}
