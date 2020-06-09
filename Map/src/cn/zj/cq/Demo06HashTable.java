package cn.zj.cq;

import java.util.HashMap;
import java.util.Hashtable;

//这个demo是测试HashTable的
/*java.utils.HashTable<K,V> 集合 implements Map<K,V>接口
Hashtable:底层也是一个哈希表，是一个线程安全的集合，是单线程集合，速度慢
HashMap：底层也是一个哈希表，是一个线程不安全的集合，是多线程的集合，速度快
HashMap集合：可以存储null值，null值
Hashtable集合：不能存储null值
 
Hashtable和Vector被HashMap和ArrayList取代*/
public class Demo06HashTable {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put(null,null);
		hm.put("c",null); 
		hm.put(null,"b"); 
		hm.put("a","a");
		System.out.println(hm);//{null=b, a=a, c=null}
		Hashtable<String, String> ht = new Hashtable<String, String>();
		//ht.put(null, "a");//java.lang.NullPointerException
		//ht.put(null, null);//java.lang.NullPointerException
		ht.put("b", "a");//{b=a}
		//ht.put("a", null);//java.lang.NullPointerException
		System.out.println(ht);
	}
}
