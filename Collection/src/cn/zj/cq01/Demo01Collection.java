package cn.zj.cq01;

import java.util.Collection;
import java.util.HashSet;

//���demo������֤Collection��Ϊ���м������Ľӿڣ����Ե��м��ϣ�ArrayList��HashSet�ȵȣ�������ʹ�ù��õķ���
//       add��remove��isEmpty��contains��toArrays
public class Demo01Collection {
	public static void main(String[] args) {
		//Collection collA = new Collection();����ӿڲ��ܴ�������ģ���ʱ���ӿڲ��ܴ������󣺽ӿ����涼�ǳ��󷽷�������������������
		Collection<String> collA = new HashSet<String>();
		collA.add("��˽�");
		collA.add("��ɮ");
		collA.add("�����");
		collA.add("������");
		//add��Դ����boolean add(E e);���ص���һ��booleanֵ������˵��
		boolean boolA = collA.add("ɳɮ");
		System.out.println(boolA);//����ɹ�����֮��ͷ���false
		System.out.println(collA);
		collA.remove("������");
		//ͬ��remove��Դ��boolean remove(Object o);������һ��booleanֵ������˵��
		boolean boolB = collA.remove("������");//���ﷵ�ش�����Ϊ���Ѿ�ɾ��
		System.out.println(boolB);
		System.out.println(collA);
		Collection<String> collB = new HashSet<String>();
		collB.add("��");
		collB.add("���");
		collB.add("����");
		collA.addAll(collB);
		collA.removeAll(collB);
		/*
		 * ����ͬ��ķ����� public boolean contains(E e): �жϵ�ǰ�������Ƿ���������Ķ���
		 *  public boolean isEmpty(): �жϵ�ǰ�����Ƿ�Ϊ�ա� 
		 *  public int size(): ���ؼ�����Ԫ�صĸ�����
		 *   public void clear():��ռ��������е�Ԫ�ء����ǲ�ɾ������,���ϻ����� 
		 */ 
		//public Object[] toArray(): �Ѽ����е�Ԫ�أ��洢�������С�:����˵��
		//String[] strA = new String[]; //���ﱨ����ΪtoArray��Դ����Object[] toArray();����ΪObject
		Object[] strA = new Object[4];
		strA = collA.toArray();
		for(int i = 0;i < collA.size(); i++) {
			System.out.print(strA[i] + " ");
		}
	}
}
