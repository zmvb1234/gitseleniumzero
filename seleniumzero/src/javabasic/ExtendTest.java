/**
 * 
 */
package javabasic;
/** 
 * @author 
 * @version 创建时间：2017年8月24日 上午10:46:11 
 * 类说明 
 */
/**
 * @author Administrator
 *
 */
public class ExtendTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ExtendFather ef =new ExtendFather();
		ExtendSon es =new ExtendSon();
		System.out.println(ef.matCal(10,10));
		System.out.println(es.matCal(10,10));
		System.out.println(es.matCal2(10,10));
	}

}
