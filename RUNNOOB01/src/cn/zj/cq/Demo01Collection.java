package cn.zj.cq;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Demo01Collection {
	public static void main(String[] args, Object[] String) {
		Collection<Object> collA = new ArrayList();
		collA.add("孙悟空");
		collA.add("猪八戒");
		collA.add("沙僧");
		collA.add("白龙马");
		collA.add('G');
		collA.add(999);
		Iterator<Object> it = collA.iterator();
		System.out.println(collA);
		collA.remove(999);
		System.out.println(collA);
		ArrayList arrayA = (ArrayList) collA;
		arrayA.remove(2);
		System.out.println(arrayA);
		arrayA.add(3,"就酱");
		System.out.println(arrayA);
		Collection<String> collB = new HashSet();
		collB.add("刘德华");
		collB.add("周华健");
		collB.add("杨宗纬");
		collB.add("李代沫");
		collB.add("李行亮");
		collB.add("沫");
		collB.add("李沫");
		collB.add("代沫");
		collB.add("李代");
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
