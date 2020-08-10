package ReflectKS;
/*
 * Reflection��JAVA����Ϊ��̬���ԵĹؼ�������������������ִ���ڽ�����Reflection APIȡ���κ�����ڲ���Ϣ������ֱ�Ӳ������������ڲ����Լ�����
 * Class c = Class.forName("java.lang.String")
 * 
 * ��������֮���ڶ��ڴ�ķ������оͲ�����һ��Class���͵Ķ���һ����ֻ��һ��Class����
 * ��������������������Ľṹ��Ϣ��ͨ������࿴����Ľ���������ѯ�����ԣ�������
 */
public class Demo03ReflectionA {
	public static void main(String[] args) throws ClassNotFoundException {
		//ͨ�������ȡ���Class����
		Class clA = Class.forName("ReflectKS.User");
		System.out.println(clA);
		Class clB = Class.forName("ReflectKS.User");
		System.out.println(clB); //���֤��һ����ֻ��һ��Class������һ���౻����֮��������Ľṹ�����װ��Class�����С����������clA�ͻ���ʾ�����ĺܶණ��
		//clA.
		/*
		 * �ص㣺��Object���ж�����һ�µķ������˷�������������̳� public final Class getClass()
		 * 		�÷����ķ���ֵ������һ��Class�ࡣ������Java�����Դͷ�� ͨ�����������������ƣ���������֪����Ľṹ
		 */
	}
}

class User{
	private String name;
	private int age;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	public User() {
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", id=" + id + "]";
	}
	
}
