/**
 * 
 */
package javabasic;
/** 
 * @author 
 * @version ����ʱ�䣺2017��8��23�� ����8:03:54 
 * ��˵�� 
 */
/**
 * @author Administrator
 *
 */
public class FunctionBasic 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// ���÷���
		FunctionBasic fb =new FunctionBasic();
		//���õ�һ������
		fb.myFirstMethod();
		//���õڶ�������
		fb.myFirstMethod("Everyone");
	}
	//���صĻ����ص���ǣ�����������ͬ�����Ƿ����������Ͳ�ͬ.�������Ͳ�ͬ�����������������Ͳ����������Ͳ�ͬ��
	// �����Լ��ĵ�һ������  
    public void myFirstMethod()
    {  
        System.out.println("Hello Java!");  
    }  
 // �����Լ��ĵڶ�������  
    public void myFirstMethod(String name)
    {  
        System.out.println("Hello!"+""+name+"!");  
    }  
}
