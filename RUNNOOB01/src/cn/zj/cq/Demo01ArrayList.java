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
		arrayB.add("悟空");
		arrayB.add("悟净");
		arrayB.add("悟能");
		arrayB.add("悟悟");
		System.out.println(arrayB);
		arrayB.add(2, "白骨精");
		System.out.println(arrayB);
		HashSet<Object> hash = new HashSet<Object>();
		hash.add("刘德华");
		hash.add("周华健");
		hash.add("杨宗纬");
		hash.add("李代沫");
		hash.add("李行亮");
		hash.add("沫");
		hash.add("李沫");
		hash.add("代沫");
		hash.add("李代");
		hash.clone();
		System.out.println(hash.clone());
		System.out.println(hash);
	}
}
