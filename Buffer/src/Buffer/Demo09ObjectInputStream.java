package Buffer;
//�����demo�ݶ�  ���в��ܽ��������

//���InvalidClassException���⣺��ΪPerson��ʵ����Serializable�ӿڣ����Ի�������еĶ�������Լ�������Personclass�ļ�������һ�����кţ�
/*	�������л�֮�󻹻������ɵ��ı��ļ�������һ�����кţ��ڽ��з����л���ʱ��Ὣ������ֵ���бȽϣ������ͬ�ͽ��з����л�������
	����仯��Person�����е����ݣ���ô�ͻ����������µ����кţ����ʱ�򲻽������л�������ֱ�ӽ��з����л����������ʱ��
	�����ɵ����кź�֮ǰ�����ɵ��ı��ļ���һ�£��ͻ���ʾ���� -------��
	���л�����ʱʹ��һ����Ϊ serialVersionUID �İ汾����ÿ�������л���������������к��ڷ����л�������������֤���л�����ķ����ߺͽ������Ƿ�Ϊ�ö�������������л����ݵ��ࡣ
	��������߼��صĸö������� serialVersionUID ���Ӧ�ķ����ߵ���İ汾�Ų�ͬ�������л����ᵼ�� InvalidClassException��
	�����л������ͨ��������Ϊ "serialVersionUID" ���ֶΣ����ֶα����Ǿ�̬ (static)������ (final) �� long ���ֶΣ���ʽ�������Լ��� serialVersionUID��
	ANY-ACCESS-MODIFIER static final long serialVersionUID = 42L;

	ֻ��Ҫ��Person�����ֶ���һ�����к�*/
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Set;

/*public class ObjectInputStream extends InputStream;
	ObjectInputStream ����ǰʹ�� ObjectOutputStream д��Ļ������ݺͶ�����з����л��� 
	ObjectOutputStream �� ObjectInputStream �ֱ��� FileOutputStream �� FileInputStream һ��ʹ��ʱ������ΪӦ�ó����ṩ�Զ���ͼ�εĳ־ô洢��ObjectInputStream ���ڻָ���Щ��ǰ���л��Ķ���
	readObject �������ڴ�����ȡ����*/
public class Demo09ObjectInputStream {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
//		methodA();
		methodB();
	}

	private static void methodB() throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("E:\\SVN\\Object");
		ObjectInputStream ois = new ObjectInputStream(fis);
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		Object obj;
		obj = ois.readObject();
		Person p = (Person)obj;
		hm.put(p.getName(),p.getAge());
		Set<String> name = hm.keySet();
		System.out.println(hm.get(name));
	}

	private static void methodA() throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("E:\\SVN\\Object");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj;
		obj = ois.readObject();
		Person p = (Person)obj; 
		System.out.println(p);
		System.out.println(p.getAge() + " " +p.getName() );
		/*
		 * while(((Person)(obj = ois.readObject())).getName()!= null) {
		 * System.out.println(obj); }
		 */
		ois.close();	
	}
}
//�ڽ������л���ʱ������Exception in thread "main" java.io.EOFException//��Ϊ�ļ����껹�ڼ����������ô���
/*
 * ����취������ 	1.���һ��null����ѭ�������ж�
 *  			2.����ȡ�������ļ��ŵ������� 
 *  			3.����ȡ�������ļ��ŵ�������   ��ס�´ν��
 */
