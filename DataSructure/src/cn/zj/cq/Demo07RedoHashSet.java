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
		/*                     这里我的这个思想是错误的
		 * Iterator<Demo07Person> ip = hp.iterator(); while(ip.hasNext()) {
		 * System.out.println(((Iterator<Demo07Person>) hp).next()); }
		 */
		hp.add(dpD);
		hp.add(dpC);
		hp.add(dpB);
		hp.add(dpA);
		Iterator<Demo07Person> it = hp.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());//这里的输出结果把全部都输出来了，为什么---->因为hashcode值不一样
		}
		System.out.println(dpC.hashCode());//1829164700
		System.out.println(dpD.hashCode());//366712642
		//如果我们只是想内容一样就表示全部相同，就不把重复的内容输出出来---->重写hashcode方法
		/*
		 * 得出结果：
		 *  Demo07PeoPle [name=川建国, age=66] 
		 *  Demo07PeoPle [name=特兰普, age=55]
		 *  Demo07PeoPle [name=奥巴马, age=77] 
		 *  22780977 
		 *  22780977
		 */
	}
}
