package cn.zj.cq;

import java.util.HashSet;
import java.util.Iterator;

//���demo��˵��HashSet��Ҫ��дhashcode������equals������
public class Demo07RedoHashSet {
	public static void main(String[] args) {
		HashSet<Demo07Person> hp = new HashSet<>();
		Demo07Person dpA = new Demo07Person("������",55);
		Demo07Person dpB = new Demo07Person("������",66);
		Demo07Person dpC = new Demo07Person("�°���",77);
		Demo07Person dpD = new Demo07Person("�°���",77);
		Iterator<Demo07Person> ip = hp.iterator();
		while(ip.hasNext()) {
			System.out.println(((Iterator<Demo07Person>) hp).next());
		}
	}
}
