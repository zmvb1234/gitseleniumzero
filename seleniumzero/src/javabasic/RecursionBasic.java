/**
 * 
 */
package javabasic;
/** 
 * @author 
 * @version 创建时间：2017年8月24日 下午3:08:15 
 * 类说明 
 */
/**
 * 递归子问题须与原始问题为同样的事，且更为简单；
 * 不能无限制地调用本身，须有个出口，化简为非递归状况处理。
 */
public class RecursionBasic {

	/**
	 * @param args
	 */
	// N! = N*(N-1)*(N-2)*...2*1  
    // 5!= 5x4x3x2x1  
	public static int factorial(int N)
	{  
        
        if(N <= 1)
        {
            return 1; 
        }
        else
        {  
            return (N*factorial(N-1));  
        }  
          
    }  
      
    public static void main(String[] args) {  
      
        System.out.println(factorial(15));  
    }  

}
