package ReflectKS;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

//��ȡ������Խṹ
public class Demo07ReflectGet {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
		Class claPerson = Class.forName("RefletHM.Person");
		//��ȡ�������
		System.out.println(claPerson.getName()); //RefletHM.Person  �� + ����
		System.out.println(claPerson.getSimpleName());//Person  ����
		//��ȡ�������
		Field[] fieldA = claPerson.getFields();
		for (Field field : fieldA) {
			System.out.println(field);  //ֻ���ӡ��public���ε�
		}
		Field[] fieldB = claPerson.getDeclaredFields();
		for (Field field : fieldB) {
			System.out.println(field);  //������private���λ���public���Σ������ӡ
		}
		//��ȡָ������   getDeclareMethod�ǻ�ȡ��������з���������˽��   û��Declare���Ǹ���Ҳ���ӡ����
		//Method getname = claPerson.getMethod("getname", String.class);  //�����ǲ��еģ���Ϊ��˽�еķ���
		Method getname = claPerson.getMethod("getName", null);//�����з������ص���˼�����ݲ�������ȥ�Ҷ�Ӧ�ķ���
		System.out.println(getname);
		Method setname = claPerson.getMethod("setName", String.class);
		System.out.println(setname);
	}
}
