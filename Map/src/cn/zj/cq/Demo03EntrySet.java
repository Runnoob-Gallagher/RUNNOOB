package cn.zj.cq;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//这个demo是练习Entry；即Map集合的第二种遍历方式
/*Map.Entry<K,V>:在Map接口中有一个内部接口Entry
作用：当Map集合一创建，那么就会在Map集合中创建一个Entry对象，来记录健与值（键值对对象，健与值得映射关系）
Set<Map.Entry<K,V>> entrySet() -->把Map集合内部的多个Entry对象取出来存储到Set集合中*/
/*Map集合中的方法----> 
Set<Map.Entry<K,V>> entrySet()  返回此映射中包含的映射关系的Set视图。
	实现步骤：
		1.使用Map集合中的方法entrySet()，吧Map集合中的多个Entry对象取出来，存储到Set集合中去
		2.遍历
		3.使用Entry对象中的方法getKey()和getValue()获取键与值*/
public class Demo03EntrySet {
	public static void main(String[] args) {
		Map<String, Integer> mapA = new HashMap<String, Integer>();
		mapA.put("孙悟空", 1);
		mapA.put("唐僧", 2);
		mapA.put("沙僧", 3);
		mapA.put("猪八戒", 4); 
		//System.out.println(mapA);
		Set<Map.Entry<String, Integer>> set = mapA.entrySet();//Map.Entry表示外部类引用内部类(你看旁边的列表)----->通过Map找到Entry：---》static interface Map.Entry<K,V> 映射项（键-值对）。 
		Iterator<Entry<String, Integer>> it = set.iterator();
		while(it.hasNext()) {
			Entry<String, Integer> key = it.next();
			System.out.println(key);
		}
		/*
		 * for(Entry<String,Integer> entry:set) { System.out.println(entry); }
		 */
	}
} 
