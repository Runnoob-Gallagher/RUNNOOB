package ReflectKS;
/*
 * ����ͨ��������Եõ�����Ϣ��ĳ��������ԡ������͹�������ĳ����ʵ�ֵ���Щ�ӿڡ�
 * ����ÿ������ԣ�JRE��Ϊ�䱣��һ�������Class���͵Ķ���
 * 
 * Class����Ҳ��һ����
 * Class����ֻ����ϵͳ��������
 * һ�����ص�����JVM��ֻ����һ��Classʵ��
 * һ��Class�����Ӧ����һ�����ص�JVM�е�һ��class����
 * ÿ�����ʵ������ǵ��Լ������ĸ�Classʵ��������
 * ͨ��Class���������ĵõ�һ���������б����صĽṹ
 * Class����Reflection�ĸ�Դ������κ�����Ҫ��̬���ء����е��࣬Ψ���Ȼ����Ӧ�Ķ���
 * 
 * 
 * ��λ�ȡClass���ʵ��
 * 
 * 	����֪������࣬ͨ�����class���Ի�ȡ���÷�����Ϊ��ȫ�ɿ�
 * 		Class cla = Person.class;
 *  ��֪ĳ�����ʵ�������ø�ʵ����getClass()������ȡClass����
 *  	Class cla = person.getClass();
 *  ��֪һ�����ȫ�������Ҹ�������·���£���ͨ��Class��ľ�̬����forName()��ȡ
 */
public class Demo03ReflectionB {
	public static void main(String[] args) throws ClassNotFoundException {
		Person person = new Student();
		System.out.println(person.name);
		//ͨ��������
		Class claA = person.getClass();
		System.out.println(claA);
		//ͨ��forName���
		Class claB = Class.forName("ReflectKS.Student");
		System.out.println(claB);
		//ͨ������.class
		Class claC = Student.class;
		System.out.println(claC);
		
		//��ø�������
		Class superclass = claA.getSuperclass();
		System.out.println(superclass);   //��ӡ��ѧ����ĸ���Person
	}
	
	
	
}

class Person{
	String name;
	int age;
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
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person() {
	}
	
	
}
class Student extends Person{
	public Student() {
		this.name = "ѧ���޶�";  //����Ǽ̳и��������   ��סѽ��������
	}
}

class Teacher extends Person{
	public Teacher() {
		this.name = "��ʦ";
	}
}














