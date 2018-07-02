/**
 * 
 */
package javabasic;
/** 
 * @author 
 * @version 创建时间：2017年8月24日 下午3:49:45 
 * 类说明 
 */
import java.util.ArrayList;
/**
 * ArrayList是一个可变化的数组。
 * 它实现了List的全部功能，主要有插入元素，编辑元素，删除元素，遍历元素。
 *
 */
public class ArrayListBasic {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// 普通的数组，我们是这样定义的  
        //int simple_array[] = new int[5]; // [1,2,3,4,5]  
        ArrayList<Integer> mylist = new ArrayList<Integer>(5);  
        mylist.add(1);  
        mylist.add(5);  
        mylist.add(3);  
        mylist.add(25);  
        mylist.add(99);  
        // 遍历
        for(Integer x : mylist)
        {  
            System.out.println(x);  
        }  
        System.out.println("Size= "+mylist.size());  
        // 删除一个元素，根据索引删除  
        mylist.remove(2); // 相当于删除了3这个元素  
        for(Integer x1 : mylist)
        {  
            System.out.println(x1);  
        }  
        System.out.println("Size= "+mylist.size());  
        // 更新某一元素的值  
        mylist.set(1, 55);  
        // 打印出来，检查下是不是把5改成55  
        for(Integer x1 : mylist)
        {  
            System.out.println(x1);  
        }  
	}

}
