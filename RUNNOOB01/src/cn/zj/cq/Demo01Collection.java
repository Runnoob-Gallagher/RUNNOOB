package cn.zj.cq;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Demo01Collection {
	public static void main(String[] args, Object[] String) {
		Collection<Object> collA = new ArrayList();
		collA.add("�����");
		collA.add("��˽�");
		collA.add("ɳɮ");
		collA.add("������");
		collA.add('G');
		collA.add(999);
		Iterator<Object> it = collA.iterator();
		System.out.println(collA);
		collA.remove(999);
		System.out.println(collA);
		ArrayList arrayA = (ArrayList) collA;
		arrayA.remove(2);
		System.out.println(arrayA);
		arrayA.add(3,"�ͽ�");
		System.out.println(arrayA);
		Collection<String> collB = new HashSet();
		collB.add("���»�");
		collB.add("�ܻ���");
		collB.add("����γ");
		collB.add("���ĭ");
		collB.add("������");
		collB.add("ĭ");
		collB.add("��ĭ");
		collB.add("��ĭ");
		collB.add("���");
		System.out.println(collB);
		//collB.clone();
		HashSet hash = (HashSet) collB;
		System.out.println(hash.clone());
		System.out.println(collB.iterator());
	    Object[] collBB = collB.toArray();
		for( int i = 0 ;i < collBB.length; i++) {
			System.out.print(collBB[i] + " ");
		}
		
		}
		
}
