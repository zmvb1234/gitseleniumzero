/**
 * 
 */
package javabasic;
/** 
 * @author 
 * @version 创建时间：2017年8月24日 上午10:21:54 
 * 类说明 
 */
/**
 *final类不能被继承
 *final方法不能被子类的方法覆盖
 *final变量只能被赋值一次，赋值后值无法改变
 *
 */
public class ExtendFather 
{
	
	int price;
	int number;

	/**
	 * @param args
	 */
	public int matCal(int a,int b)
   {
		// TODO Auto-generated method stub
		this.number=a;
		this.price=b;
        return number*price;
   }
   

}
