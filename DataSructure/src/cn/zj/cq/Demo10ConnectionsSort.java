package cn.zj.cq;
//这个demo是 Comparable接口位于java.lang包下，需要重写public int compareTo(T o)方法；
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
		ad.add(new Demo10ConnectionsPerson("罗成剑", 45));
		ad.add(new Demo10ConnectionsPerson("冯志明", 55));
		ad.add(new Demo10ConnectionsPerson("贺靖岭", 35));
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
 