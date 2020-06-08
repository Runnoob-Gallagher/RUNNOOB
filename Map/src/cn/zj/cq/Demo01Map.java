package cn.zj.cq;

import java.util.HashMap;
import java.util.Map;

//���demo����ϤMap���ϵ����༰���÷���
/*java.util.Map<k,v>����
Map�����ص㣺
	1.Map������һ��˫�м��ϣ�һ��Ԫ�ذ�������ֵ��һ��key,һ��value��
	2.Map�����е�Ԫ�أ�key��value���������Ϳ�����ͬ�����Բ�ͬ---->(String,Integer)
	3.Map�����е�Ԫ�أ�key�ǲ������ظ��ģ�value�ǿ����ظ���
	4.Map�����е�Ԫ�أ�key��value��һһ��Ӧ�ģ���key�����ҵ���Ӧ��valueֵ*/
//ע��hashset�ײ�Ҳ�ǹ�ϣ�� hashset����new�ľ���hashmap���ϣ�����ֻʹ��map�����ص�key���Բ������ظ�
//ע��HashMap����֤ӳ���˳���ر𲻱���˳���ò���
/*HashMap���ϵ��ص㣺
	1.HashMap���ϵײ��ǹ�ϣ����ѯ���ٶ��ر��
		jdk1.8֮ǰ������+��������
		jdk1.8֮������+��������/�����������ĳ��ȳ���8��--->��߲�ѯ�ٶ�
	2.HashMap������һ������ļ��ϣ��洢Ԫ�غ�ȥ��Ԫ�ص�˳����ܲ�һ��
java.util.LinkedHashMap<k,v>����extends HashMao<k,v>����
LinkedHashMap���ص㣺
	1.LinkedHashMap���ϵײ��ǹ�ϣ��+������֤����˳��
	2.LinkedHashMap������һ������ļ��ϣ��洢Ԫ�غ�ȡ��Ԫ�ص�˳����һ����*/
public class Demo01Map {
	public static void main(String[] args) {
		//methodA();
		//methodB();
		//methodC();
		methodD();
	}
	//methodD---->boolean containsKey(Object key)���жϼ����Ƿ���ڸ�Ԫ�أ�����ture����false
	private static void methodD() {
		// TODO Auto-generated method stub
		Map<String,String> mapD = new HashMap<String, String>();
		mapD.put("�й�", "ϰ��ƽ");
		mapD.put("����", "����");
		mapD.put("�ձ�", "����");
		mapD.put("����˹", "�վ�");
		boolean b = mapD.containsKey("�й�");
		System.out.println(b);
	}

	//methodC---->public V get(Objeck key):���ݼ����ض�Ӧ��ֵ
	
	private static void methodC() {
		// TODO Auto-generated method stub
		Map<String,String> mapC = new HashMap<String, String>();
		mapC.put("�й�", "ϰ��ƽ");
		mapC.put("����", "����");
		mapC.put("�ձ�", "����");
		mapC.put("����˹", "�վ�");
		
		String v = mapC.get("�й�");
		System.out.println(v); //ϰ��ƽ
		String v1 = mapC.get("�ú�");
		System.out.println(v1); //null
	}
	

	/*
	 * methodB----> public V remove (Oject key):��ָ���ļ�����Ӧ�ļ�ֵ��Ԫ�� ��Map������ɾ�������ر�ɾ��Ԫ�ص�ֵ
	 *ɾ�������ڵļ�ʱ���ؿ�null
	 */
	private static void methodB() {
		// TODO Auto-generated method stub
		Map<String,String> mapB = new HashMap<String, String>();
		mapB.put("�й�", "ϰ��ƽ");
		mapB.put("����", "����");
		mapB.put("�ձ�", "����");
		mapB.put("����˹", "�վ�");
		System.out.println(mapB);
		String v = mapB.remove("����");
		System.out.println(v);//����
	}
	//methodA---> 
	/*
	 * public V put(k key,v value);��ָ���ļ���ֵ��ӵ�Map������ȥ ����ֵV��
	 * 1.��Map�������Ѿ����ڸü��ǣ������µ�valueֵ 2.��Map�����ز����ڸļ�ʱ������null
	 */
	private static void methodA() {
		// ����Map���϶���ʹ�ö�̬  
			Map<String,String> mapA = new HashMap<>();
			String v1 = mapA.put("�й�", "Number 1");
			String v2 = mapA.put("�й�", "��һ");
			  
			System.out.println(v2);//���ر��滻��ֵ  Number 1
			System.out.println(mapA);//{�й�=��һ}
	}
}
