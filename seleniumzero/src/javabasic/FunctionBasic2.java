/**
 * 
 */
package javabasic;
//import javabasic.functionBasic1;
/** 
 * @author 
 * @version ����ʱ�䣺2017��8��23�� ����8:30:13 
 * ��˵�� 
 */
/**
 * @author Administrator
 *
 */
public class FunctionBasic2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
    {
	//��ʼ��һ���������ʵ��	
	FunctionBasic1 fb1=new FunctionBasic1();
	fb1.setAge(18);
	fb1.setId(1);
	fb1.setName("С��");
	System.out.println(fb1.getName() + " ���� " + fb1.getAge() + "��.");
	FunctionBasic1 fb11=new FunctionBasic1(2);
	fb11.setAge(18);
	fb11.setId(1);
	fb11.setName("С��");
	System.out.println(fb11.getName() + " ���� " + fb11.getAge() + "��.");
	FunctionBasic1.DoSomethingWithStatic();
	//���Ƽ���ô��
	//fb11.DoSomethingWithStatic();
	//ʵ�����÷Ǿ�̬����
	fb11.DoSomethingWithNoStatic();
    }
	
}
