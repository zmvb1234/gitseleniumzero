/**
 * 
 */
package javabasic;
/** 
 * @author 
 * @version 创建时间：2017年8月24日 下午2:37:18 
 * 类说明 
 */
/**
 * 1）如果前后两个都是class,那么就用extends
 * 2）如果前面一个是class,后面一个是interface，那么就用implements
 * 3）如果前后两个都是interface，就用extends。
 *
 */
public class InterfaceBasic2 implements InterfaceBasic1
{
	public int getAge()
	{  
        return 15;  
    }  
}
