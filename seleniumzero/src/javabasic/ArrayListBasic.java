/**
 * 
 */
package javabasic;
/** 
 * @author 
 * @version ����ʱ�䣺2017��8��24�� ����3:49:45 
 * ��˵�� 
 */
import java.util.ArrayList;
/**
 * ArrayList��һ���ɱ仯�����顣
 * ��ʵ����List��ȫ�����ܣ���Ҫ�в���Ԫ�أ��༭Ԫ�أ�ɾ��Ԫ�أ�����Ԫ�ء�
 *
 */
public class ArrayListBasic {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// ��ͨ�����飬���������������  
        //int simple_array[] = new int[5]; // [1,2,3,4,5]  
        ArrayList<Integer> mylist = new ArrayList<Integer>(5);  
        mylist.add(1);  
        mylist.add(5);  
        mylist.add(3);  
        mylist.add(25);  
        mylist.add(99);  
        // ����
        for(Integer x : mylist)
        {  
            System.out.println(x);  
        }  
        System.out.println("Size= "+mylist.size());  
        // ɾ��һ��Ԫ�أ���������ɾ��  
        mylist.remove(2); // �൱��ɾ����3���Ԫ��  
        for(Integer x1 : mylist)
        {  
            System.out.println(x1);  
        }  
        System.out.println("Size= "+mylist.size());  
        // ����ĳһԪ�ص�ֵ  
        mylist.set(1, 55);  
        // ��ӡ������������ǲ��ǰ�5�ĳ�55  
        for(Integer x1 : mylist)
        {  
            System.out.println(x1);  
        }  
	}

}
