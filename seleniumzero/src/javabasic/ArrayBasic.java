/**
 * 
 */
package javabasic;
/** 
 * @author 
 * @version ����ʱ�䣺2017��8��23�� ����7:49:19 
 * ��˵�� 
 */
/**
 * @author Administrator
 *
 */
public class ArrayBasic {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] myarry = {1,4,5,2,9};  
        //���������Ĵ������鷽ʽ  
        /* 
         int[] myArry = new int[3]; //����һ�����飬��3��Ԫ�� 
         int[] myArry = {1,2,3};    //��������鸳ֵ 
         int[] myArry = new int[]{1,2,3};  //�������п��Լ�д����һ�� 
         */  
        // ������������ȡ����Ԫ�أ�������0��ʼ������myarry[0]= 1  
        System.out.println("��������Ϊ0��Ԫ��Ϊ�� " + myarry[0]);  
        // myarry.lengh��ʾ���鳤�ȣ�Ҳ����Ԫ�ظ���  
        System.out.println("���鳤��Ϊ�� " + myarry.length);  
        // ��������Ԫ��,����whileѭ��ʵ������Ԫ�ر���  
        int index = 0;  
        while(index < myarry.length) 
        {  
            System.out.println(myarry[index]);  
            index++;  
        }  
	}

}
