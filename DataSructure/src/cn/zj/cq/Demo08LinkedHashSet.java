package cn.zj.cq;

import java.util.HashSet;
import java.util.LinkedHashSet;

//这个demo是说明LinkedHashSet集合的
/*LinkedHashSet集合 extends HashSet集合
LinkedHashSet集合特点：
	底层是一个哈希表（数组+链表/红黑树）+ 链表---->多的链表是记录元素的存储顺序，保证了元素的同序性*/
public class Demo08LinkedHashSet {
	public static void main(String[] args) {
		HashSet<String> hash = new HashSet<String>();
		hash.add("Apple");
		hash.add("HuaWei");
		hash.add("Vivo");
		hash.add("Apple");
		System.out.println(hash);
		//输出结果：[Apple, Vivo, HuaWei]---->可以发现不能存储重复数据，元素的顺序不能保证；再看一下LinkedHashSet
		LinkedHashSet<String> link = new LinkedHashSet<String>();
		link.add("天");
		link.add("地");
		link.add("玄");
		link.add("黄");
		link.add("天");
		System.out.println(link);//现在结果就是对的
	}
}
