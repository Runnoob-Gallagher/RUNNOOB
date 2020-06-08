package cn.zj.cq;

import java.util.HashMap;
import java.util.LinkedHashMap;

//这个demo是验证LinkedHashSet的有序性和不可以重复性
/*java.util.LinkedHashMap<K,V> extends HashMap<K,V>
 * 底层原理：
 * 	哈希表+链表（记录元素顺序）
 * */
public class Demo05LinkedHashSet {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("一", 1);
		hm.put("二", 2);
		hm.put("三", 3);
		hm.put("四", 4);
		hm.put("四", 4);
		System.out.println(hm);//无序的,不允许重复---->{一=1, 三=3, 四=4, 二=2}
		LinkedHashMap<String, Integer> lm = new LinkedHashMap<String, Integer>();
		lm.put("一", 1);
		lm.put("二", 2);
		lm.put("三", 3);
		lm.put("四", 4);
		lm.put("四", 4);
		System.out.println(lm);//有序，不允许重复---->{一=1, 二=2, 三=3, 四=4}
}
}
