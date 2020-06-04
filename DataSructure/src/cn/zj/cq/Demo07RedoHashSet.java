package cn.zj.cq;

import java.util.HashSet;
import java.util.Iterator;

//这个demo是说明HashSet需要重写hashcode方法和equals方法的
public class Demo07RedoHashSet {
	public static void main(String[] args) {
		HashSet<Demo07Person> hp = new HashSet<>();
		Demo07Person dpA = new Demo07Person("特兰普",55);
		Demo07Person dpB = new Demo07Person("川建国",66);
		Demo07Person dpC = new Demo07Person("奥巴马",77);
		Demo07Person dpD = new Demo07Person("奥巴马",77);
		Iterator<Demo07Person> ip = hp.iterator();
		while(ip.hasNext()) {
			System.out.println(((Iterator<Demo07Person>) hp).next());
		}
	}
}
