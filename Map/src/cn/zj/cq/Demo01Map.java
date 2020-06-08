package cn.zj.cq;

import java.util.HashMap;
import java.util.Map;

//这个demo是熟悉Map集合的子类及常用方法
/*java.util.Map<k,v>集合
Map集合特点：
	1.Map集合是一个双列集合，一个元素包含两个值（一个key,一个value）
	2.Map集合中的元素，key和value的数据类型可以相同，可以不同---->(String,Integer)
	3.Map集合中的元素，key是不允许重复的，value是可以重复的
	4.Map集合中的元素，key和value是一一对应的，用key就能找到对应的value值*/
//注：hashset底层也是哈希表 hashset集合new的就是hashmap集合，但是只使用map集合重的key所以不允许重复
//注：HashMap不保证映射的顺序，特别不保障顺序恒久不变
/*HashMap集合的特点：
	1.HashMap集合底层是哈希表：查询的速度特变快
		jdk1.8之前：数组+单向链表
		jdk1.8之后：数组+单项链表/红黑树（链表的长度超过8）--->提高查询速度
	2.HashMap集合是一个无序的集合，存储元素和去除元素的顺序可能不一样
java.util.LinkedHashMap<k,v>集合extends HashMao<k,v>集合
LinkedHashMap的特点：
	1.LinkedHashMap集合底层是哈希表+链表（保证迭代顺序）
	2.LinkedHashMap集合是一个有序的集合，存储元素和取出元素的顺序是一样的*/
public class Demo01Map {
	public static void main(String[] args) {
		//methodA();
		//methodB();
		//methodC();
		methodD();
	}
	//methodD---->boolean containsKey(Object key)：判断集合是否存在该元素：有则ture无则false
	private static void methodD() {
		// TODO Auto-generated method stub
		Map<String,String> mapD = new HashMap<String, String>();
		mapD.put("中国", "习近平");
		mapD.put("美国", "川普");
		mapD.put("日本", "安倍");
		mapD.put("俄罗斯", "普京");
		boolean b = mapD.containsKey("中国");
		System.out.println(b);
	}

	//methodC---->public V get(Objeck key):根据键返回对应的值
	
	private static void methodC() {
		// TODO Auto-generated method stub
		Map<String,String> mapC = new HashMap<String, String>();
		mapC.put("中国", "习近平");
		mapC.put("美国", "川普");
		mapC.put("日本", "安倍");
		mapC.put("俄罗斯", "普京");
		
		String v = mapC.get("中国");
		System.out.println(v); //习近平
		String v1 = mapC.get("好好");
		System.out.println(v1); //null
	}
	

	/*
	 * methodB----> public V remove (Oject key):把指定的键所对应的键值对元素 在Map集合中删除，返回被删除元素的值
	 *删除不存在的键时返回空null
	 */
	private static void methodB() {
		// TODO Auto-generated method stub
		Map<String,String> mapB = new HashMap<String, String>();
		mapB.put("中国", "习近平");
		mapB.put("美国", "川普");
		mapB.put("日本", "安倍");
		mapB.put("俄罗斯", "普京");
		System.out.println(mapB);
		String v = mapB.remove("美国");
		System.out.println(v);//川普
	}
	//methodA---> 
	/*
	 * public V put(k key,v value);把指定的键于值添加到Map集合中去 返回值V：
	 * 1.当Map集合中已经存在该键是，返回新的value值 2.当Map集合重不存在改键时，返回null
	 */
	private static void methodA() {
		// 创建Map集合对象使用多态  
			Map<String,String> mapA = new HashMap<>();
			String v1 = mapA.put("中国", "Number 1");
			String v2 = mapA.put("中国", "第一");
			  
			System.out.println(v2);//返回被替换的值  Number 1
			System.out.println(mapA);//{中国=第一}
	}
}
