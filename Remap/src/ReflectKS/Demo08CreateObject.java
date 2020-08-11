package ReflectKS;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import RefletHM.Person;

//ͨ����������֮�������ܸ�����---->��������
public class Demo08CreateObject {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Class claA = Class.forName("RefletHM.Person");
		//ͨ���õ������ȡ������
		Constructor conA = claA.getConstructor();//��Ϊ����û��ֵ������һ���޲ι�������������ɾ��֮��Person�۵��޲ι������ͻᱨ��
		System.out.println(conA);
		//ͨ������õ����ഴ������
		Object obj = claA.newInstance(); //���Խ���ǿת   Person person = (Person)claA.newInstance();
		System.out.println(obj);//���صĶ������޲ε�
		//ͨ����������������
		Constructor conB = claA.getConstructor(String.class,int.class,int.class,String.class);
		Person person = (Person) conB.newInstance("Gallagher",24,25,"Success");
		System.out.println(person);
		System.out.println(person.getName());
		//ͨ�������ȡ����
		Method setname = claA.getMethod("setName", String.class);
		//invoke():���ڼ���  
		/*invoke���ظ�ʽ��
		 * (����,"��������ֵ")  ��������ģ� setname.invoke(person,"���");  
		 * ���Լ������setname�ķ���������ֵ�������setname�����Ķ��󣬺ͷ�������ֵ
		 */
		setname.invoke(person,"���");
		System.out.println(person.getName()); 
		
		
		//ͨ�������ȡ���󣬲���������
		Person personA = (Person) claA.newInstance();
		Field field = claA.getDeclaredField("name");
		field.setAccessible(true);  //�رճ���İ�ȫ��⣬�������ܴ�ӡ����
		field.set(personA, "���");
		System.out.println(personA.getName());//����Person with modifiers "private"  ��ΪName��private����
	}
}
