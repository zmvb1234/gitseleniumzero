/**
 * 
 */
package javabasic;
/** 
 * @author 
 * @version ����ʱ�䣺2017��8��23�� ����8:23:56 
 * ��˵�� 
 */
/**
 * @author Administrator
 *
 */
public class FunctionBasic1 {

	/**
	 * ��װ�Ѷ����������ɲ��������һ�𣬷�װ�������������ö�������ݣ�
	 * ��װʵ����ʹ�÷���������������������������û�������޸ĺͷ������ݵĳ̶ȡ�
	 */
	   //��װ
	   private int id;  
	   private String name;  
	   private int age;  
	   /**���ǹ��캯����
	    1�����캯������һ��Ҫ�������Ʊ���һ�¡�
	    2�����캯�����ڶ��󴴽������ǵ���
	    3�����캯�������ж�����ò��������Ͳ�����������
	    4�����캯���ڲ�û�з������
	     * 
	     */
	    FunctionBasic1()
	    {
	    System.out.println("���ǹ��캯����");	
	    }
	    FunctionBasic1(int a)
	    {
	    System.out.println("���ǹ��캯����"+a);	
	    }
		/**
		 * @return the id
		 */
		public int getId() 
		{
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(int id)
		{
			this.id = id;
		}
		/**
		 * @return the name
		 */
		public String getName() 
		{
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) 
		{
			this.name = name;
		}
		/**
		 * @return the age
		 */
		public int getAge() 
		{
			return age;
		}
		/**
		 * @param age the age to set
		 */
		public void setAge(int age) 
		{
			this.age = age;
		}
		//��static�ؼ��ֵķ������ͽо�̬��������̬����ֻ�ܱ��౾����ã����ܱ����ʵ��������ã�����־��棬���Ͳ�ƥ�䣩.
		//��û��static�ؼ��ֵķ����������н�ʵ������
	    public static void DoSomethingWithStatic()
	    {  
	        System.out.println("������static����");  
	    }  
	      
	    public void DoSomethingWithNoStatic()
	    {  
	        System.out.println("�����˷�static����");  
	    } 

}
