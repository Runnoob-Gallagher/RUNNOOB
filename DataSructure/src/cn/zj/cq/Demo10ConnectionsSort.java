package cn.zj.cq;
//���demo�� Comparable�ӿ�λ��java.lang���£���Ҫ��дpublic int compareTo(T o)������
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Demo10ConnectionsSort {
	public static void main(String[] args) {
		ArrayList<Integer> ai = new ArrayList<Integer>();
		ai.add(1);
		ai.add(5);
		ai.add(2); 
		ai.add(3); 
		ai.add(4); 
		Collections.sort(ai);
		System.out.println(ai);
		ArrayList<Demo10ConnectionsPerson> ad = new ArrayList<Demo10ConnectionsPerson>();
		ad.add(new Demo10ConnectionsPerson("�޳ɽ�", 45));
		ad.add(new Demo10ConnectionsPerson("��־��", 55));
		ad.add(new Demo10ConnectionsPerson("�ؾ���", 35));
		Collections.sort(ad);
		System.out.println(ad); 
		/*
		 * Collections.sort(ai, new Comparator<Integer>() {
		 * 
		 * @Override public int compare(Integer o1, Integer o2) { // TODO Auto-generated
		 * method stub return 0; }
		 * 
		 * });
		 */
	}
}
 