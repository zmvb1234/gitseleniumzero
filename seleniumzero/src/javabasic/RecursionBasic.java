/**
 * 
 */
package javabasic;
/** 
 * @author 
 * @version ����ʱ�䣺2017��8��24�� ����3:08:15 
 * ��˵�� 
 */
/**
 * �ݹ�����������ԭʼ����Ϊͬ�����£��Ҹ�Ϊ�򵥣�
 * ���������Ƶص��ñ������и����ڣ�����Ϊ�ǵݹ�״������
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
