package cn.zj.cq;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author ASUS
 *
 */
public class Demo01ArrayList {
	public static void main(String[] args) {
		ArrayList<Object> arrayB = new ArrayList<Object>();
		arrayB.add("���");
		arrayB.add("��");
		arrayB.add("����");
		arrayB.add("����");
		System.out.println(arrayB);
		arrayB.add(2, "�׹Ǿ�");
		System.out.println(arrayB);
		HashSet<Object> hash = new HashSet<Object>();
		hash.add("���»�");
		hash.add("�ܻ���");
		hash.add("����γ");
		hash.add("���ĭ");
		hash.add("������");
		hash.add("ĭ");
		hash.add("��ĭ");
		hash.add("��ĭ");
		hash.add("���");
		hash.clone();
		System.out.println(hash.clone());
		System.out.println(hash);
	}
}
