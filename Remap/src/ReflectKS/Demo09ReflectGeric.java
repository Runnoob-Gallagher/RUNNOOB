package ReflectKS;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import RefletHM.Person;

//ͨ�������ȡ���͵���Ϣ
public class Demo09ReflectGeric {
	public void methodA(Map<String,Person> map,List<String> list ) {
		System.out.println("methodA");
	}
	public Map<String,Person> methodB(){
		System.out.println("methodB");
		return null;
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Class claA = Demo09ReflectGeric.class;
		Method method = claA.getMethod("methodA", Map.class,List.class);
		Type[] typeA = method.getGenericParameterTypes(); //��ȡ������Ϣ�Ĳ�����Ϣ
		for (Type type : typeA) {
			System.out.println(type);
			/*
			 * ִ�н����
			 * java.util.Map<java.lang.String, RefletHM.Person>
             * java.util.List<java.lang.String>    ����û�з��ؾ��壬���Ի���Ҫ����type�������Ϣ
			 */
			if(type instanceof ParameterizedType) { //��־���type�������ڲ��������ͣ���Ҫ��������
				Type[] typeB = ((ParameterizedType)type).getActualTypeArguments();     //�����ʵ�Ĳ�������
				for (Type typeC : typeB) {
					System.out.println(typeC);
					/*
					 * ִ�н����
					 * java.util.Map<java.lang.String, RefletHM.Person>
					 *class java.lang.String
					 *class RefletHM.Person
					 *java.util.List<java.lang.String>
					 *class java.lang.String
					 */
				}
			}
		}//ParameterizedType ��ʾһ�ֲ��������ͣ���������д��Map<String,Person>
		Method methodb = claA.getMethod("methodB", null);
		Type type = methodb.getGenericReturnType();
		System.out.println(type);
		if(type instanceof ParameterizedType) {
			Type[] typeD = ((ParameterizedType)type).getActualTypeArguments();
			for (Type typeE : typeD) {
				System.out.println(typeE);
			}
		}
	}
}
