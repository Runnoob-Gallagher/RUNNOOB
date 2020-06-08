package cn.zj.cq;
//���demo��������Ϥ�Զ������ͼ�ֵ
/*Map�����е�key��Ψһ�ģ�value�������ظ���
	��Ϊkey��Ԫ�أ�������дhashCode������equals�������Ա�֤keyΨһ*/
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo04HashMap {
	public static void main(String[] args) {
		//Map<String, Integer> mapA = new HashMap<String, Integer>();
		
		//methodA();
		methodB();
	}
	/* methodB����----��
	 * HashMap�洢�Զ������ͼ�ֵ 
	 * key��Person����
	 * 			 String���ͱ�����дHashCode������Equals���������Ա�֤keyΨһ
	 * value��String���� 
	 * 			value�����ظ���ͬ��ͬ������Ϊͬһ���ˣ�
	 */
	
	private static void methodB() {
		// TODO Auto-generated method stub
		Map<Demo04Person, String> mapB = new HashMap<Demo04Person, String>();
		mapB.put( new Demo04Person("���", 24),"����");
		mapB.put( new Demo04Person("��·", 26),"����");
		mapB.put( new Demo04Person("��Сޱ", 30),"����");
		mapB.put( new Demo04Person("����", 24),"����");
		mapB.put( new Demo04Person("����", 24),"��");
		Set<Demo04Person> set = mapB.keySet();
		Iterator<Demo04Person> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(mapB.get(it.next()));
		}
	}
	
	
	/* methodA����----��
	 * HashMap�洢�Զ������ͼ�ֵ 
	 * key��String����
	 * 			 String������дHashCode������Equals���������Ա�֤keyΨһ
	 * value��Person���� 
	 * 			value�����ظ���ͬ��ͬ������Ϊͬһ���ˣ�
	 */
	private static void methodA(){
		Map<String, Demo04Person> mapA = new HashMap<String, Demo04Person>();
		mapA.put("����",new Demo04Person("���", 24));
		mapA.put("����", new Demo04Person("��·", 26));
		mapA.put("����", new Demo04Person("��Сޱ", 30));
		mapA.put("����", new Demo04Person("����", 24));
		mapA.put("��", new Demo04Person("����", 24)); 
		Set<String> set = mapA.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(mapA.get(it.next()));
		}
		
}
	}
